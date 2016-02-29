import java.util.HashSet;
import java.util.Set;

public class FindWords {

    public Set<String> returnWords(String str) {

        Set<String> validWords = new HashSet<String>();

        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                sb.append(str.charAt(j));
                validWords.add(sb.toString());
            }
        }
//        System.out.println(validWords);
        return validWords;
    }
}