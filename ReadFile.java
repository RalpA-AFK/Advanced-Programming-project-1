import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFile {

    public ArrayList <String> dictionary = new ArrayList<>();

    public ReadFile() throws FileNotFoundException{
        File file = new File("words_alpha.txt");
        Scanner scnr = new Scanner(file);

        while (scnr.hasNextLine()) {
            String currentWord = scnr.nextLine();
            dictionary.add(currentWord);
        }

    }
}

