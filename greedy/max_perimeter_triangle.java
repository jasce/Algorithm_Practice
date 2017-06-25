import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
      //  ArrayList<Integer> l = new ArrayList<Integer>();
        Arrays.sort(arr);
        int in = -1;
        for(int i=n-1;i>=2;i--){
            if(arr[i] < arr[i-1] + arr[i-2]){
               // l.add(arr[i-1] + arr[i-2]+ arr[i]);
                System.out.print( arr[i-2] + " ");
                System.out.print( arr[i-1] + " ");
                System.out.print( arr[i]);
                in = 0;
                 break;
            }       
            
        }
        if(in == -1)
            System.out.println(-1);
        
        
    }
}