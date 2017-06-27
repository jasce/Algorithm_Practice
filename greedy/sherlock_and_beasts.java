import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int z = n;
            
            while(z%3 != 0){
                z -= 5;
            }      
            int ti = n-z;
            if(z< 0)
                System.out.print("-1");
            else{
                while(z > 0){
                    System.out.print("5");
                    z--;
                }
                while(ti > 0){
                    System.out.print("3");
                    ti--;
                }          
            
            }
            System.out.println();
            
        }
    }
}