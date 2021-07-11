package Wk2;

import java.util.Scanner;
//Reverse the string using byte
public class ByteRev {
    public static byte[] revByte(byte[] chars) {
        byte [] tmp = new byte[chars.length];
        for (int i = 0,  j = chars.length - 1; j >=0; i ++, j -- ) {
            tmp[i] = chars[j];
        }
        return tmp;
    }

    public static String revString(String input) {
        byte [] chars = input.getBytes();
        return new String(revByte(chars));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        System.out.println(revString(input.nextLine()));
    }
}
