import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int [n];
        int[] imp = new int [n];
        ArrayList<Integer> l = new ArrayList <Integer>();
        int total =0;
        for(int i=0; i< n ;i++){
            arr[i] = sc.nextInt();
            imp[i] = sc.nextInt();
            total += arr[i];
            if(imp[i] == 1)
                l.add(arr[i]);            
        }
        int i = l.size();
        Collections.sort(l);
        while(k != i && k < i){
            total -= 2 * l.get(0);
            l.remove(0);
            i--;
        }
        System.out.println(total);
        
    }
}