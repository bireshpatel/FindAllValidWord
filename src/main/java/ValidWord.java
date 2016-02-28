import java.util.ArrayList;
import java.util.Scanner;

public class ValidWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Take user input
        String inputStr = input.nextLine();
        sentence2Words(inputStr);
    }

    public static String[] sentence2Words(String strSentence) throws IndexOutOfBoundsException {

        System.out.println(strSentence);
        String[] aWords = strSentence.split(" ");
//        Array strToVerify;
//        String aWords = strSentence.replaceAll("\\W","");

        ArrayList<String> list = new ArrayList<String>();
        for(String str : aWords)
            if(!str.equals(""))
                list.add(str);
        String[] strToVerify = list.toArray(new String[list.size()]);

        for(int i=0; i < strToVerify.length; i++){
            System.out.println("String is: " + strToVerify[i]);
        }
        return aWords;
    }
}
