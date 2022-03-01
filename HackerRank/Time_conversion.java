import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String time = scan.next();
        
        String AmPm = time.substring(8);
        
        int hh1= Integer.parseInt(time.substring(0,2));
        
        String ss= time.substring(2,8);
        
        String checkPM = "PM",checkAM ="AM";
        String h = time.substring(0,2);
        int h2=hh1;
        
        if(AmPm.equals(checkAM) && hh1==12)
            h="00";
        else if(AmPm.equals(checkPM)&& hh1<12)
            h=Integer.toString(h2+12);
       
        System.out.printf(h+ss);
    }
}
