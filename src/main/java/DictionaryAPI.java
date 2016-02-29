import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

public class DictionaryAPI {

    public String submitHttpGetRequest(String host, String path, String queryTerm) throws URISyntaxException, IOException {
        @SuppressWarnings("unused")
        String retVal = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();

        CloseableHttpResponse response;
        URIBuilder builder = new URIBuilder().setScheme("http").setHost(host).setPath(path);
        builder.addParameter("action", "define");
        builder.addParameter("dict", "*");
        builder.addParameter("query", queryTerm);
        URI uri = builder.build();

        HttpGet httpget = new HttpGet(uri);

//        System.out.println(httpget.getURI());
        response = httpclient.execute(httpget);
        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                BufferedReader rd = new BufferedReader(new InputStreamReader(entity.getContent()));
                StringBuffer result = new StringBuffer();
                String line = "";
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
                if(result.toString().contains("No definitions found"))
                {
                    System.out.println(queryTerm + " : Word is Invalid");
                }
                else {
                    System.out.println(queryTerm + " : Word is Valid");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            response.close();
        }
        return null;
    }
}
