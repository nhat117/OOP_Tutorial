package Wk2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
//Enter a string into array and sort it
public class sortCity {
    public static void main(String[] args) {
        int size = 3;
        Scanner input = new Scanner(System.in);
        String [] arr = new String[size];
        for (int i = 0; i < size ; i ++) {
            System.out.printf("Enter city %d name: ", i + 1);
            arr[i] = input.next();
        }
        //Sort the array
        System.out.printf("The %d city in alphabet order are: \n", arr.length);
        Arrays.sort(arr);
        //Display arr
        for (String s: arr) {
            System.out.printf("%s ", s);
        }
    }
}
