import java.io.*;
import java.util.*;

public class InsertionSort {

	static void sort(int[] a) {
		for(int k=1;k<a.length;k++) {
			int key=a[k];
			int i=k-1;
			while(i>=0 && a[i] > key) {
				a[i+1]=a[i];
				i=i-1;
			}
			a[i+1]=key;
		}

		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		System.out.println("After Sorting : ");
		sort(a);
	}
}