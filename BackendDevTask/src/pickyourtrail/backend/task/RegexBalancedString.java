package pickyourtrail.backend.task;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexBalancedString {

	public static void main(String[] args) {
		// Scanner to read input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String request = sc.nextLine();
		// Regular Expression pattern to validate
		String regExPattern = "(?=^(([^bd]*[bd]){2})*[^bd]*$)(([^ac]*[ac]){2})*[^ac]*";
		// validating request with regex pattern
		System.out.println(Pattern.matches(request, regExPattern));
		// Scanner close
		sc.close();
	}
}
