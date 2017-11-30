package cn.rootadmin;

/**
 * 程序入口
 * @author 王宜亮
 * @version  2017年8月26日  下午4:07:01
 */
public class StartSpider {
    public static void main(String[] args) {
        
        String startUrl = "http://www.rs05.com/movie/?p=";
        	
        int i = 1;
        
        
        new Spider().startSpider(startUrl+i,i);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     /*   int pageTota = 1748;
        
        for (int i = 1673; i < pageTota; i++) {
            System.out.println("第"+i+"页"+startUrl+i);
            new Spider().startSpider(startUrl+i,i);
        }*/
        
        /*title="([^"]+)"
*/    }
}
