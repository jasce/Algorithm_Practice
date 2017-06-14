import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here+       
        Arrays.sort(scores);
        int rank = 1;
        int f = 0;
        
        for(int i=0;i<alice.length;i++){
            f=0;
            if(alice[i] >= scores[scores.length-1]){
               System.out.println(1);
                f = 1;
            }
            else{
                rank=1;
            }
            for(int j=scores.length-1;j>0;j--){             
                
                if(scores[j-1] != scores[j] && scores[j-1] > alice[i] && f==0){
                    rank++;
                }
                 if(scores[j-1] != scores[j] && scores[j-1] <= alice[i] && f==0){
                    System.out.println(++rank);
                    break;
                }
                if(scores[j-1] == alice[i] && f==0){
                    System.out.println(rank);
                    break;
                }
                if(j == 1 && f==0){
                    System.out.println(++rank);
                    break;
                }
            }
            
        }
        
    }
}
