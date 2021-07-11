package Wk2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Find the unique word in a string usng HashMap
public class PrintUniqueWord {
    public static HashMap<String, Integer>  findUnique(String inp) {
        HashMap<String, Integer> words = new HashMap<>();
        //Split the string
        //Spit the white space
        String[] wrds = inp.split("\\W");
        for (String w : wrds) {
            if (words.containsKey(w)) {
                //Increment the count value if occurence
                words.put(w, words.get(w) + 1);
                continue;

            }
            //Store the words in side map and set value 1;
            words.put(w, 1);
        }
        return words;
    }

    //Print the hash map
    public static void printUnique(HashMap <String, Integer> inp) {
        for (Map.Entry<String, Integer> entry: inp.entrySet()) {
            if(entry.getValue() == 1) {
	            System.out.println(entry.getKey());
            }
        }
    }

    //Driver code
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a String: ");
        printUnique(findUnique(inp.nextLine()));
    }
}
