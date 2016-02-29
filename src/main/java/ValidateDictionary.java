import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

public class ValidateDictionary {

    public void returnValidWord(Set<String> setWord){
//        System.out.println(setWord);

        String host = "services.aonaware.com";
        String path = "/DictService/Default.aspx";
        DictionaryAPI dictAPI = new DictionaryAPI();

        Iterator<String> it = setWord.iterator();
        while(it.hasNext()){
            String checkStr = it.next();
            try {
                dictAPI.submitHttpGetRequest(host, path, checkStr);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
}
