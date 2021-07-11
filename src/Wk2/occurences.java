package Wk2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class occurences {

        public static void main(String[] args) {
            String str= "the colored port should be black or white or brown";
            Pattern pattern = Pattern.compile(" colored ");
            Matcher matcher = pattern.matcher(str);

            int count = 0;
            while (matcher.find())
                count++;

            System.out.println(count);
        }
}
