import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            char a[][] = new char[n][n];
            for(int i= 0; i < n;i++){
                String s =sc.next();
                a[i] = s.toCharArray();
                Arrays.sort(a[i]);
            }
            int flag=0;
            for(int i = 0 ;i < n ;i++){
                for(int j=0; j <n-1 ;j++){
                    if(a[j][i] > a[j+1][i])
                    { flag=1;
                     break;}
                    if(flag==1){
                        break;
                    }
                }
            }
            if(flag==1)
                System.out.println("NO");
            else
                System.out.println("YES");
            
            t--;
        }
        
    }
}