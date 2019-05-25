
import java.util.Scanner;
 


public class NumberUtilities {

    public static String getRange(int stop) {
        
        String x = "";
        for (int j = 0; j<stop; j++){
        x += j;
        }
        
        return x;
    }

    public static String getRange(int start, int stop) {
        String x = "";
        for (int j= start; j<stop; j++){
        x += j;
        }
        return x;
    }


    public static String getRange(int start, int stop, int step) {
        String x = "";
        for (int j = start; j < stop; j+=step) {
        x  +=j;
        }
        return x;
    }

    public static String getEvenNumbers(int start, int stop) {
        String x = "";
        for (int j = start; j < stop; j++) {
        if (j % 2 == 0) {
           x += j;
        }
        }
        return x;
    }


    public static String getOddNumbers(int start, int stop) {
        String x = "";
        for (int j = start; j < stop; j++) {
        if ( j % 2 != 0) {
         x+= j;
        }
        }
        return x;
    }


    public static String getExponentiations(int start, int stop, int exponent){
        String x = "";
        for (int j = start; j <= stop; j++){
        x += (int)Math.pow(j,exponent);
        }
        return x;
    }
}
