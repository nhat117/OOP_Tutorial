package Wk2;

import java.util.Scanner;

public class PrintStringOccurence {
    public static void printOccurence(String inp) {
        int occurrences = 0;

        //Split string in to words
        String[] words = inp.split("\\W");


        //Iterate throught thw words arr, could be eliminate if search for  only 1 word
        for (int i = 0; i < words.length; i++) {
            //Set occurences of current words by 1
            occurrences = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    occurrences++;
                    //Remove the words out
                    words[j] = "";
                }
            }
            //Out put the result
            if(occurrences >= 1 && words[i] != "" && words[i] != " ") {
                System.out.println(words[i] + " occurs " + occurrences + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        printOccurence(inp.nextLine());
    }
}
