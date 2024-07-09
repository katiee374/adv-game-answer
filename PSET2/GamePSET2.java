package PSET2;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class GamePSET2 {
    private final String[] DIRECTIONS = {"North", "South", "East", "West"};
    private ArrayList<Room> blueprint;
    Actor player;
    ArrayList<String> commands = new ArrayList<String>(Arrays.asList("take", "drop", "n", "s", "e", "w"));
    ArrayList<String> objects = new ArrayList<String>(Arrays.asList("sword", "ring", "key"));

    public GamePSET2() throws IOException {
        //create new Scanner, which will take input from the keyboard
        Scanner scan = new Scanner(System.in);
        String input = "";
        blueprint = new ArrayList<Room>();
        //intialize rooms:
        blueprint.add(new Room("Dungeon", "A dark, cold stone room", -1, 3, 2, -1));
        blueprint.add(new Room("Cottage", "A warm cozy cabin", -1, 2, -1, -1));
        blueprint.add(new Room("Forest", "A dense evergreen forest", 1, 4, -1, -1));
        blueprint.add(new Room("Castle", "A majestic castle", 0, -1, 4, -1));
        blueprint.add(new Room("Field", "A dusty, hot, open field", 2, -1, -1, 3));
        player = new Actor("Player 1", "A worthy knight");

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

    public boolean moveTo(Actor a, String direction) {
        int exit;
        Room room = a.getLocation();
        switch (direction) {
            case "North":
                exit = room.getN();
            case "South":
                exit = room.getS();
            case "East":
                exit = room.getE();
            case "West":
                exit = room.getW();
            default:
                exit = -1;
        }
        if (exit==-1) {
            return false;
        }
        a.setLocation(blueprint.get(exit));
        return true;
    }
    
    /**
     * A method that splits the input String into words.
     * 
     * @param input - the String to be split
     * @return words - array of Strings that are the words in the input 
     *         Strings
     */
    public String[] wordList(String input) {
        //these are the things that can separate words:
        String delims = "[\t,.:;?!\"']";
        //this splits the input String into an array of words
        String[] strArray = input.split(delims);
        return strArray;
    }
    
    public void parseCommand(String[] wordList) {
        //declared some variables for you
        String verb;
        String noun;
        ArrayList<String> commands = new ArrayList<String>(Arrays.asList("take", "drop", "n", "s", "e", "w"));
        ArrayList<String> objects = new ArrayList<String>(Arrays.asList("sword", "ring", "key"));
        verb = wordList[0];
        noun = wordList[1];
        processVerb(verb);
    }

    private void processVerb(String str) {
        switch (str) {
            case "n":
                moveTo(player, "North");
            case "s":
                moveTo(player, "South");
            case "w":
                moveTo(player, "West");
            case "e":
                moveTo(player, "East");
        }
    }
}