import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMinimumCost(int n, int k, int[] c){
        // Complete this function
        Arrays.sort(c);
        int total = 0;
        int level = 0;       
         for(int i = n-1 ;i>= 0;){
                for(int j=0;j < k; j++){
                    total += (level + 1) * c[i];                   
                    i--;
                    if(i<0)
                        break;
                }             
              level++;             
            }
        
        return total;   
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }
}
