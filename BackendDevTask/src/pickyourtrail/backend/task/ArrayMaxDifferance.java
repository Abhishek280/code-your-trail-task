package pickyourtrail.backend.task;
import java.util.Scanner;

public class ArrayMaxDifferance {

	public static void main(String[] args) {

		// Scanner to read inputs
		Scanner sc = new Scanner(System.in);
		// total no of integers
		int n;
		System.out.println("Enter the number of size of array:");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the numbers:");
		// Reading the numbers
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		// Calling method to find max difference
		System.out.println(maxDifference(a, n));

	}

	static int maxDifference(int a[], int n) {
		int maxDiff = a[1] - a[0];
		int min = a[0];
		int i;
		for (i = 1; i < n; i++) {
			if (a[i] - min > maxDiff)
				maxDiff = a[i] - min;
			if (a[i] < min)
				min = a[i];
		}
		return maxDiff;
	}

}
