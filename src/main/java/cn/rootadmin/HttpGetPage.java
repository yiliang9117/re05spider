package cn.rootadmin;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 请求网页
 * @author 王宜亮
 * @version  2017年8月26日  下午2:19:09
 */
public class HttpGetPage {
    
    /**
     * 请求传进来的地址
     * 返回页面信息
     * @param url
     * @return
     */
    public String getPage(String url) {
        try {
            URL u = new URL(url);
            HttpURLConnection con = (HttpURLConnection) u.openConnection();
            InputStream in = con.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int len = 0 ;
            while((len = in.read(buf)) != -1){
                baos.write(buf,0,len);
            }
            in.close();
            baos.close();
            String pageStr = new String(baos.toByteArray());
            
            System.out.println("pageStr"+pageStr);
            
            return pageStr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    

}
