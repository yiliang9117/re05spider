package cn.rootadmin;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class Http{


    int num = 0;

    public String doGet() throws Exception  {
        String url = "http://www.rs05.com/movie/?p=4";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;

        try {
            response = httpclient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");

                num++;
                System.out.println("打开："+num);
            }
        } finally {
            if (response != null) {
                response.close();
            }
            httpclient.close();
        }
        return  null;
    }
    

    int numTest = 0;

    public String doGetTest() throws Exception  {
        String url = "http://www.baike789.com/";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;

        try {
            response = httpclient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");

                numTest++;
                System.out.println("打开："+numTest);
            }
        } finally {
            if (response != null) {
                response.close();
            }
            httpclient.close();
        }
        return  null;
    }
    
    
}
