
import java.util.Scanner;
import java.util.Set;

public class ValidWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Take user input
        System.out.println("Please Enter the Word to Check: ");

        while (!input.hasNext("^[a-zA-Z]+$")) {
            System.out.println("Not a Valid Word");
            input.next();
            break;
        }
        String word = input.next();
        System.out.println("Word is: " + word);

        FindWords findWords = new FindWords();
        Set<String> checkWord = findWords.returnWords(word);

        ValidateDictionary validateDictionary = new ValidateDictionary();
        validateDictionary.returnValidWord(checkWord);
    }
}
