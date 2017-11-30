package cn.rootadmin.test;

public class HttpUtil {


    public static void main(String[] args)throws Exception {
    	
    	System.out.println(111);

        Http http = new Http();
        for (int i = 0; i < 999; i++) {
            http.doGet();
        }

    }
}
