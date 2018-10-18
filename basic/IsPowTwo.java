import java.io.*;
import java.util.*;

// Test x = 4(100);
// x-1= 3(011);

// x & (x - 1)  = (100) & (011) = (000) = 0

public class IsPowTwo {

	public static void isPowerTwo(int number) {
		if((number & (number-1)) == 0 || number == 0) {
			System.out.println("It is a power of 2");
		} else {
			System.out.println("It is not a power of 2");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		while(testCases-- >= 0) {
			int number = sc.nextInt();
			isPowerTwo(number);
		}
	}

}