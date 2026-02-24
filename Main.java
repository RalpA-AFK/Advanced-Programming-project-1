import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws FileNotFoundException {
    ReadFile reader = new ReadFile();
    ArrayList<String> dictionary = reader.dictionary;

    Scanner scnr = new Scanner(System.in);
    System.out.println("Below Type out any english word (type STOP to exit)");
    String userInput = scnr.nextLine();

    while(true){
        if(userInput.equals("STOP")){
            break;
        }
        if(dictionary.contains(userInput)){
            System.out.println("Correctly spelled the following: " + userInput);
        }else{

            System.out.println("Word not found. Were you trying to spell: ");


        }

    }

    }
}
