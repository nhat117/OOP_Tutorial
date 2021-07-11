package Wk2;

import java.util.Scanner;
//Reverse a string
public class revString {

    public static String revString(String input) {
        StringBuilder  tmp = new StringBuilder(input);
        tmp.reverse();
        return tmp.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        System.out.println(revString(input.nextLine()));
    }
}
