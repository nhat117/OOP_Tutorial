package Wk2;

import java.util.Locale;
import java.util.Scanner;
/*
Write a program that prompts the user to enter a year and astring of three characters for amonth name (with the first letter in uppercase) thendisplays the number of days in the month. If the user enters an invalid value for year or month, print out a helpful error message. Sample run:
 */
public class Yearstr {
    enum Month {Jan , Feb, Mar, Apr, May, Jun, Jul , Aug, Sep, Oct, Nov, Dec};
    //Valid and get the value of the enum
    public static Month monthValider(String month) {
        Month monthVar = null;
        //Get value of the month
        Month [] allMonth = Month.values();
        for(Month M : allMonth) {
            if(M.toString().toLowerCase(Locale.ROOT).equals(month.toLowerCase())) {
                monthVar = Month.valueOf(month);
            }
        }
        return monthVar;
    }

    //Calculate date
    public static void calculateDate(int year, String month) {
        Month var = monthValider(month);
        int days;
        if(var == null) {
            System.out.println("You have enter invalid month");
            return;
        }
        //Check if 30 days
        if (var == Month.Apr || var == Month.Jun || var == Month.Sep || var == Month.Nov ) {
            days = 30;
        } else if(var == Month.Feb) {
            //Check leap
            days = chkLeap(year);
        } else {
            days = 31;
        }
        System.out.printf("%s of %d have %d days",month,year,days);
    }

    public static int chkLeap(int year) {
        return ((year % 4 == 0 || year % 400 == 0 )&& year % 100 !=0) ? 29 : 28;
    }

    //Driver code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user to enter
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();
        calculateDate(year,month);
    }

}
