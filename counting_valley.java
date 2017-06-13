import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum=0;
        int valley=0;
        Scanner sc = new Scanner(System.in);
        HashMap <Character,Integer> hm = new HashMap <Character, Integer>(); 
        hm.put('U', 1);
        hm.put('D', -1);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();        
        char[] c = s.toCharArray();
        for(int i=0; i < c.length;i++){            
            sum = sum + hm.get(c[i]);            
            if(sum == 0 && c[i] == 'U'){
                valley++;
            }
        }
        System.out.println(valley);
      
    }
}