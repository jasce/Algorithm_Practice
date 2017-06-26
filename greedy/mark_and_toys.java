import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int k = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int toy =0 ;
        Arrays.sort(prices);
        for(int i=0; i< n;i++){
            if(prices[i] <= k)
              {
                toy++;
                k = k- prices[i];
               }
            else
                break;
        }
        System.out.println(toy);
    }
}