import java.io.*;
import java.util.*;

public class CountOnes {

	public static int count(int number) {
		int count = 0;
		while(number > 0) {
			number = number & (number-1);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-- > 0) {
			int number = sc.nextInt();
			System.out.println("Count number of one:" + count(number));
		}
	}
}