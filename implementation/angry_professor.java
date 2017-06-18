import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ontime_count = 0;
            int[] students = new int[n];
            for(int i =0 ;i<n;i++){
                students[i] = sc.nextInt();
                if(students[i] <= 0)
                    ontime_count++;
            }
            if(ontime_count >= k )
                System.out.println("NO");
            else
                System.out.println("YES");
            
            t--;
            
        }
    }
}