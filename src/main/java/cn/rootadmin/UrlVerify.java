package cn.rootadmin;

import java.util.ArrayList;

/**
 * 判断页面重复请求及相关验证
 * 
 * @author 王宜亮
 * @version 2017年8月26日 下午2:56:42
 */
public class UrlVerify {
    
     ArrayList<String> urlList = new  ArrayList<String>();

    public Boolean testUrlRepeat(String url) {
        Boolean testUrlnull = testUrlnull(url);//先验证是不是null
        
        
        //TODO 去重
        return testUrlnull;
    }

    public Boolean testUrlnull(String url) {
        return null != url ? true : false;
    }

}
