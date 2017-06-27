import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i =0;i<n ; i++){
                a[i] = sc.nextInt();
            }
            for(int i =0;i<n ; i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int failed = 0;
            for(int i=0,j=n-1; i<n;i++,j--){
                if(a[i] + b[j] < k){
                    failed = 1;
                    break;
                }
            }
            if(failed == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}