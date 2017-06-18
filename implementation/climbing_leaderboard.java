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
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0,scores[0]);
        for(int i=1;i<scores.length;i++){            
            if(scores[i-1] !=scores[i]){
                al.add(scores[i]);                
            }
            else
                continue;       
            
        }
        int index = al.size()-1;
        for(int i=0; i<alice.length;i++){
            for( int j=index; j>=0;j--){
                
                if(alice[i] >= al.get(0)){
                    System.out.println(1);
                    break;
                }
                if(alice[i] < al.get(j))
                {
                    System.out.println(j+2);
                    index = j;
                    break;
                }
                else if(alice[i]==al.get(j))
                {
                    System.out.println(j+1);
                    index =j;
                    break;
                }
                
            }
        }       

        
    }
}
