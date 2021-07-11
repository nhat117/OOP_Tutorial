package wk1;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.print("Enter number of line: ");
        Scanner input = new Scanner(System.in);
        printPyramid(input.nextInt());
    }
//Print abd allign int the piramid shape
    private static void printPyramid(int line) {
        //Outter for loops
        for (int i = 1; i <= line; i ++) {
            //Loops to handle space
            for(int k = i ; k <=line; k ++) {
                System.out.print("  ");

            }
            printNum(i);
            //Go to the nextline;
            System.out.println(" ");
        }
    }
    //Generate and print number
    private static void printNum(int input) {
        for (int i =  - input ; i <= input; i ++) {
            if (i == 0 || i == 1) {
                continue;
            }
            System.out.printf("%d ",Math.abs(i));
        }
    }
}
