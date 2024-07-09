package PSET1;
import java.io.*;
import java.util.Scanner;

public class GamePSET1 {
    public static void main(String[] args) throws IOException {
        //create new Scanner, which will take input from the keyboard
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (!input.equals("q")) {
            System.out.print(">");
            input = scan.nextLine();
            if (input.equals("q")) {
                System.out.println("Thanks for playing!");
                break;
            }
            String[] words = wordList(input);
            parseCommand(words);
        }
        scan.close();
    }
    
    /**
     * A method that splits the input String into words.
     * 
     * @param input - the String to be split
     * @return words - array of Strings that are the words in the input 
     *         Strings
     */
    public static String[] wordList(String input) {
        //these are the things that can separate words:
        String delims = "[\t,.:;?!\"']";
        //this splits the input String into an array of words
        String[] strArray = input.split(delims);
        return strArray;
    }
    
    public static void parseCommand(String[] wordList) {
        //declared some variables for you
        String verb;
        String noun;
        String[] commands = {"take", "drop"};
        String[] objects = {"sword", "ring", "key"};
        verb = wordList[0];
        noun = wordList[1];
    }
}