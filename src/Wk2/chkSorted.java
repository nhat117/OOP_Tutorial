package Wk2;

import java.util.Arrays;
import java.util.Scanner;

//Write  a  program  that  determines  if  a  list  is  already  sorted  in  increasing  order.  The program should prompt the user to enter a list and displays whether the list is sorted in ascending order or not. Note that the first number in the input indicates the number of the elements in the list. The program exits when the first number is 0.
public class chkSorted {

    public static boolean isListSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
	        if (arr[i] > arr[i + 1]) {
	            return false;
            }
        }
        return true;
    }

    public static void diplay(boolean input) {
        if(!input) {
            System.out.println("The list is not sorted");
            return;
        }
        System.out.println("The list is sorted");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int [] arr;
        System.out.print("Enter a list of number :");
        size = input.nextInt();
        arr = new int[size];
        //Populate the array
        for(int i = 0; i < size; i ++) {
            arr[i] = input.nextInt();
        }
        if (size == 0) {
            System.exit(0);
        }
        diplay(isListSorted(arr));
    }
}
