import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        // your code goes here
        long cals = 0;
        int i,j;
        Arrays.sort(calories);
        for( i = calories.length-1,j=0 ;i > -1; i--,j++){
            cals += Math.pow(2,j) * calories[i];
           
        }
        System.out.println(cals);
    }
}
