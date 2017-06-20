import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        // your code goes here
        int min = 100000000;
        int last;             
        Arrays.sort(a);
        last = a[0] < 0 ?-a[0]: a[0] ;
         for(int i = 1 ;i <n;i++ ){
            a[i] = a[i]<0 ? -a[i] : a[i];           //Store Absolute Values     
             last = (a[i] - a[i-1]) < 0? a[i-1] - a[i] :  a[i] - a[i-1];
             if(last < min)
                 min = last;
        } 
        System.out.println(min);          
    }
}
