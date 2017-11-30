package cn.rootadmin;

import java.util.ArrayList;

public class Spider extends Thread {

    // get请求网络
    HttpGetPage httpGetPage = new HttpGetPage();

    // 匹配页面
    MatchPage matchPage = new MatchPage(); 
    
    
    

    public void startSpider(String url,int pageNum) {

        // 获取页面
        String moviePage = httpGetPage.getPage(url);
        
        
        
        System.out.println("over");
        
        
        
        
        
        
        
        
        
        
        
        
        

        /*// 获取子页面地址列表
        ArrayList<String> itemUrlList = matchPage.getItemList(moviePage);
        
        for (int i = 0; i < itemUrlList.size(); i++) {
            int pageNumStr = pageNum*10;
            System.out.println("第"+pageNumStr+i+"条数据");
            String itemPage = httpGetPage.getPage(itemUrlList.get(i));
            matchPage.getMovieItemInfo(itemPage,itemUrlList.get(i));
        }*/
    }
}
