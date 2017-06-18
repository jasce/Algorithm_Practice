import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=n;i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
}