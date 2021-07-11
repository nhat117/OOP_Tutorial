package Wk2;

import java.util.Locale;
import java.util.Scanner;

public class occurenceChar {
    //Count occurencces, could be replace with another counting algorithm
    public static int countChar(String input, char search) {
        input.toLowerCase(Locale.ROOT);
        return (int) input.chars().filter(ch -> ch == search).count();
    }

    public static void dispOccurence (String input) {
        int count;
        for (int i = 97; i <= 122 ; i ++) {
            count = countChar(input,(char) i);
            if(count !=0) {
                System.out.printf(" %c occur %d times\n", (char) i, count );
            }
        }
    }

    public static void main(String[] args) {
    //Prompt user eneter
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        dispOccurence(input.nextLine());
    }
}
