import java.io.*;
import java.util.*;

public class CheckNthBitSet {

	public static void checkBitSet(int number, int location) {
		number = number & (1 << (location));
		if (number > 0) {
			System.out.println(number + "bit is set");
		} else {
			System.out.println(number + "bit is not set");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		while(testCases-- >= 0) {
			int number = sc.nextInt();
			int ith = sc.nextInt();
			// ith bit number is bounded by 0 <= location <= sqrt(number)
			checkBitSet(number, ith);
		}
	}
}