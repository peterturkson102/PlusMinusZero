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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int arrSize= arr.size();
    List<Integer> positiveNum = new ArrayList<Integer>();
    List<Integer> negativeNum = new ArrayList<Integer>();
    List<Integer> zeroNum = new ArrayList<Integer>();
    
   
    
    for(Integer a : arr){
    if(a>0){
        positiveNum.add(a);
    }else if(a<0){
        negativeNum.add(a);
    }else{
        zeroNum.add(a);
    }
    }
    
    double posRatio= (double) positiveNum.size()/arrSize;
    double negRatio= (double)negativeNum.size()/arrSize;
    double zeroRatio=(double)zeroNum.size()/arrSize;
    
    /*had to cast to double else wont get double response from the integer division(the response would be zero integer if not cast before setting)
    */
    
    
      System.out.println(String.format("%.6f",posRatio)+"\n"+ String.format("%.6f",negRatio)+"\n"+ String.format("%.6f",zeroRatio));
    
    /*Used String.format("%.6f",value) to convert the response to 6 decimal places that can be printed but if i needed the 6 decimal places as an object variable i would cast the double to DecimalFormat object or BigDecimal object*/
    
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
