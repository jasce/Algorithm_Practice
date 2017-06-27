import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q =  sc.nextInt();
        while(q-- > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            long[] cy = new long[m];
            long [] cx = new long[n];
            for(int i=1;i<m;i++){
                cy[i] = sc.nextInt();
            }
            for(int i=1;i<n;i++){
                cx[i] = sc.nextInt();
            }
            int y_index = m-1, x_index = n-1;
            int horizontal = 0;
            int vertical = 0;
            long total = 0;
            Arrays.sort(cy);
            Arrays.sort(cx); 
            int val = (m-1)+(n-1);
            while(val-- > 0){
                if(cy[y_index] >= cx[x_index] && y_index >=1 ){
                    total = total + ((vertical + 1 ) * cy[y_index])% 1000000007;
                    horizontal++;
                    y_index--;
                }
                else if(cy[y_index] < cx[x_index] && x_index >=1){
                    total = total + ((horizontal + 1) * cx[x_index]) % 1000000007;
                    vertical++;
                    x_index--;
                }
            }
            System.out.println(total % 1000000007);
            
        }
    }
}