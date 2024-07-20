package leet.code.self;

import com.sun.deploy.net.BasicHttpRequest;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import com.sun.deploy.net.HttpUtils;
import netscape.javascript.JSObject;
import org.testng.annotations.Test;
import sun.net.www.URLConnection;
import sun.net.www.http.HttpClient;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author guoyanrui on 2022/2/16
 */
public class ApiTest {
    public static void main(String[] args) throws IOException {
        BasicHttpRequest httpRequest = new BasicHttpRequest();
        try {
            URL url = new URL("https://www.v2ex.com/api/nodes/show.json?name=python");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.connect();//调用URLConnection对象提供的connect方法连接远程服务
            InputStream inputStream = urlConnection.getInputStream();//获取输入流访问的资源数据

//        InputStream inputStream = httpResponse.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void getApi() {
    }
}
