package Wk2;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Scanner;
//Check if a string is palindrome or not
public class chkcPal {

    public static String cleanUp(String input) {
        StringBuilder tmp = new StringBuilder();
        //Clean up string with out punctuation
        for(int i = 0 ; i < input.length(); i ++) {
            if(Character.isLetterOrDigit(input.charAt(i))) {
                tmp.append(input.charAt(i));
             }
        }
        return tmp.toString();
    }

    //Cleanup using regex
    public static String cleanUpRegex(String input) {
        return input.toLowerCase(Locale.ROOT)
                    .replaceAll("[^a-z]","");
    }

    public static @NotNull
    String revString(String input) {
	    StringBuilder  tmp = new StringBuilder(cleanUp(input));
	    tmp.reverse();
	    return tmp.toString();
    }

    public static boolean palCheck(String input) {
        String cleanup = cleanUp(input);
        return cleanup.equalsIgnoreCase(revString(input));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inp = input.nextLine();
        System.out.println(palCheck(inp));
    }
}
