import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] d = new int[n];
        int[] total = new int[n];
        for(int i = 0; i< n; i++){
            t[i] = sc.nextInt();
            d[i] = sc.nextInt();
            total[i] = t[i] + d[i];
        }
        int min=1000000;
        int index = 0;
        int change = 0; 
        for(int i=0;i<n;i++){
            min = total[i];            
            change = 0;
            for(int j=0;j<n;j++){                
                if(min > total[j] && total[j] < 100000000){
                    min = total[j];
                    index = j;   
                    change = 1;
                }               
            }
            if(change == 0){
                total[i] = 1000000000;
                System.out.print(i+1 + " ");
            }
            else{
            total[index] = 1000000000;
            System.out.print(index+1 + " ");
            }
            
        }
        
     }
}