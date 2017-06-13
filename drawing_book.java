import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        int i=1;
        int k=1;
        int result;
        int count_front=0 , count_back=0;       
        
        if(p==1 || p==n || (p==n-1 && n%2 !=0)){ // If first page or last page 
            return 0;
        }
       // check from front
        do{
            count_front++;            
            if(2*i == p || (2*i)+1 == p)
                break;
            i++;
            
        }
        while(true);           
        
        // check from back
        do{
             count_back++;            
            if(n%2!=0){
                if(n-(k+1) ==p || n-(k+2) ==p)
                    break;
            }
            else
                {
                if(n-k ==p || n-(k+1) ==p )
                    break;
                 }
            k=k+2;
            
        }
        while(true);           
        
        result = count_front >= count_back ? count_back : count_front;
        
        return result;      
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
