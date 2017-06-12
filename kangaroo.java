import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        if( (x1 > x2 && v1 > v2 )|| (x2 > x1 && v2 > v1)){
            return "NO";
        }
        else if (x1 == x2){
            return "YES";
        }        
        else if( v1 == v2){
            return "NO";
        }
        else{
            if ((Math.abs(x1-x2))%(Math.abs(v1-v2)) == 0  && v1 > v2){
                return "YES";
            }
            else{
                return "NO";
            }
           
        }
        
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x1 = sc.nextInt();
       int v1 = sc.nextInt();
       int x2 = sc.nextInt();
       int v2 = sc.nextInt();
       String result = kangaroo(x1,v1,x2,v2);
       System.out.println(result);
    }
}
