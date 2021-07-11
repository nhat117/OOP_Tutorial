package wk1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tmp;

        while(true) {
            System.out.print("Enter a positive integer ");
            tmp = input.nextInt();
            if (tmp < 0) break;
            if(tmp % 5 == 0 && tmp %6 == 0) {
                System.out.println(tmp + " is divisible for both 5 and 6");
            } else if(tmp % 5 == 0 || tmp %6 == 0) {
                System.out.println(tmp + " is divisible by 5 or 6");
            } else {
                System.out.println(tmp + " is not divisible by 5 and 6");
            }
        }
        System.out.println("The number enter is negative");
    }
}
