import java.util.Set;


public class CommonClass {

    public void stringToTest(String word){

        FindAllPossibleWord findAllPossibleWord = new FindAllPossibleWord();
        Set<String> checkWord = findAllPossibleWord.returnWords(word);

        ValidateDictionary validateDictionary = new ValidateDictionary();
        validateDictionary.returnValidWord(checkWord);
    }
}
