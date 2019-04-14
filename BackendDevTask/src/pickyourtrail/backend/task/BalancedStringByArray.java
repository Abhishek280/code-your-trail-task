package pickyourtrail.backend.task;
import java.util.Scanner;

public class BalancedStringByArray {

	public static void main(String[] args) {
		// Scanner to read input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String request = sc.nextLine();

		// length of string
		int length = request.length();

		// string to character array
		char a[] = request.toCharArray();

		// scanner close
		sc.close();

		// prints the output from balanced String method
		System.out.println(balancedString(a, length));

	}

	static Boolean balancedString(char a[], int length) {
		int even = 0, odd = 0;
		for (int i = 0; i < length; i++) {
			if (a[i] == 'a' || a[i] == 'c') {
				even = even + 1;
			} else {
				odd = odd + 1;
			}
		}
		if (even % 2 == 0 && odd % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
