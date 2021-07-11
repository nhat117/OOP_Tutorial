package Wk2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class distictNum {
    //Count the frequency of a num
    public static <T> int frequency( ArrayList<T> input, int i) {
            return Collections.frequency(input,i);
    }

    public static void disticntCheck (ArrayList<Integer> input) {
        ArrayList <Integer> res = new ArrayList<>();
        int distinctRes = 0;
        //Check for 1 to 100
        for (int i = 1; i <= 100; i ++) {
            int freq = frequency(input,i);
            if( freq== 1) {
                distinctRes ++;
                res.add(i);
            }
        }

        //Display
        System.out.printf("Number of distinct number is %d\n",distinctRes);
        System.out.printf("The distinct number is: ");
        for (Integer s: res) {
            System.out.printf(" %d ",s);
        }
    }

    public static void main(String[] args) {
        //Prompt user input
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> inputArr = new ArrayList<Integer>();
        System.out.println("Enter ten number");
        for(int i = 0; i < 10; i ++) {
            inputArr.add(input.nextInt());
        }
        disticntCheck(inputArr);
    }

}
