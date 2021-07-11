package Wk2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class wordString {
    //Count the occurence of a string
    public static int countOccurences(String[] tmp, String word) {
        int count = 0;
        for (int i = 0; i < tmp.length; i ++) {
            if (word.equals(tmp[i])) {
                count ++;
            }
        }
        return count;
    }

    //Need a collection of word
    public static Map<String, Integer> selectWord(String str) {
        String []tmp = str.split(" ");
        Map <String, Integer> res = new HashMap<String,Integer>();
        for(String s : tmp) {
            for(String k : res.keySet() ) {
                if(!s.equals(k)) res.put(s,countOccurences(tmp,s));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input String: ");
        Map<String, Integer> res = selectWord(input.nextLine());
        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

}
