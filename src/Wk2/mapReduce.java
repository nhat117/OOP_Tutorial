package Wk2;

import java.util.*;

public class mapReduce {
    private final static int size = 100;

    public static  ArrayList<Integer> generateRandom() {
        ArrayList <Integer> out = new ArrayList<>();
        int max = 9, min = 0, range = max - min +1;
        int randNum;
	    for (int i = 0; i < size; i ++) {
            randNum= (int) (Math.random() * range) + min;
            out.add(randNum);
	    }
	    return out;
    }

    public static <T> void frequency( ArrayList <T> input) {
        for (int i = 1; i <= 9; i ++) {
            int k = Collections.frequency(input,i);
            if(k ==1) {
                System.out.printf("%d occurs %d time \n",i,k);
            } else if (k!=0 && k != 1) {
                System.out.printf("%d occurs %d times \n",i,k);
            }
        }
    }

    public static void main(String[] args) {
        frequency(generateRandom());
    }
}
