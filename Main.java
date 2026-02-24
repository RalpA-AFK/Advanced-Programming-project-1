import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws FileNotFoundException {
    ReadFile reader = new ReadFile();
    ArrayList<String> dictionary = reader.dictionary;

    Scanner scnr = new Scanner(System.in);

    while(true){
        System.out.println("Below Type out any english word (type Stop to exit)");
        String userInput = scnr.nextLine().toLowerCase();
        String closestWord = "";
        int minDistance = Integer.MAX_VALUE;

        if(userInput.equals("stop")){
            break;
        }
        if(dictionary.contains(userInput)){
            System.out.println("Correctly spelled the following: " + userInput);
        }else{
            for(String dictWord : dictionary){
                int dist = Levenshtein.LevenshteinDistance(userInput,dictWord.toLowerCase());
                if(dist < minDistance){
                    minDistance = dist;
                    closestWord = dictWord;
                }
            }
            System.out.println("Word not found. Did you mean to spell \"" + closestWord + "\"? (Type yes or no)");
            String userBoolean = scnr.nextLine().toLowerCase();
            if(userBoolean.equals("yes")){
               System.out.println("\"" + closestWord + "\"");
            }else{
                System.out.println("Try again");
                }
            }


    }

  }

}
