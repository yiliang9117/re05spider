package cn.rootadmin;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
class MyThread extends Thread {


    @Override
    public void run()  {
        Http http = new Http();
        for (int i = 0; i < 999; i++) {
            try {
            	System.out.println(i);
                http.doGet();
                http.doGetTest();
            } catch (Exception e) {
                System.out.println("出错");
                e.printStackTrace();
            }

        }
    }
}
