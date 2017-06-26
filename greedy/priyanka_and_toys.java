import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for(int i=0; i<n; i++){
            w[i] = sc.nextInt();
        }
        Arrays.sort(w);
        int units = 1;
        int curr = w[0] + 4;
        for(int i=1;i<n;i++){
            if(w[i] > curr)
            {
                units++;
                curr = w[i] + 4;
            }
        }
        System.out.println(units);
    }
}