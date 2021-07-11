package wk1;

public class FormattedOutput {
    public static void main(String[] args) {
        //Print the header
        System.out.printf("%9s %14s %4s %14s %9s \n", "Miles", "Kilometers","|","Kilometers" , "Miles");
        for(int i = 1; i < 11; i ++) {
            //Miles to kilo
            int miles =  i;
            double kiloRes = (double) miles * 1.609;
            // Kilo to miles
            int kiloMeters = miles * 5 + 15;
            double milesRes = (double) kiloMeters / 1.609;

            System.out.printf("%7d %12.2f %8s %10d %13.2f\n", miles, kiloRes, "|", kiloMeters, milesRes);
        }

    }
}
