import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }        
        int[] arr = new int[n];
         k = k%n;
        int index_front =0;
        int index_back= n-k;
        for(int i = 0 ; i< n ;i++){
            if(index_back <= n-1){
                arr[i] = a[index_back];
                index_back++;
            }
            else if (index_back != index_front){
                arr[i] = a[index_front];
                index_front++;
            }   
            
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(arr[m]);
        }
        
    }
}
