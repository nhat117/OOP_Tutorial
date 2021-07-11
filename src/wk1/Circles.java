package wk1;

import java.util.Scanner;

public class Circles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Get the coordinate and radius
        //Circle 1
        double x,y, rad;
        System.out.print("Enter circle 1 x-coordinates, y-coordinates and radius: ");
        x = input.nextDouble();
        y = input.nextDouble();
        rad = input.nextDouble();
        //Circle 2
        double x2,y2,rad2;
        System.out.print("Enter circle 1 x-coordinates, y-coordinates and radius: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        rad2 = input.nextDouble();

        System.out.println("Input accept");

        //Check the conditions of 2 circle
        double distance = Math.sqrt(Math.pow((x-x2),2) + Math.pow((y-y2),2));
        if(distance<= Math.abs(rad - rad2)) {
            System.out.println("Circle 2 inside circle 1");
        } else if (distance <= rad + rad2) {
            System.out.println("Circle 2 is overlap with 1");
        } else System.out.println("Circle 2 is outside circle 1");
    }
}
