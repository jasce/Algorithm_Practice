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
        int max_frequency = 0;
        int frequency =0;
        for(int i= 1; i<100; i++){
            frequency = 0;
            for(int j=0; j< a.length; j++){
                if(a[j] == i || a[j] == i+1)
                    frequency++;
                if(frequency > max_frequency)
                    max_frequency = frequency;
            }
            
        }
        System.out.println(max_frequency);
    }
}
