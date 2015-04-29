import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class a04 {
	/*
	 * A palindromic number reads the same both ways. The largest palindrome
	 * made from the product of two 2-digit numbers is 9009 = 91 × 99. Find the
	 * largest palindrome made from the product of two 3-digit numbers.
	 */
	public static void main(String[] args) {
		// Total number of digits that will be multiplied together
		final byte limit = 6;
		long start = new Date().getTime();
		List<Integer> l1 = new ArrayList<Integer>();

		// Create max multiplied number from num of digits
		int n1 = (int) Math.pow(10, limit) - 1, o1 = 0;
		final int minNum = (int) (n1 - Math.pow(10, Math.ceil(limit / 2) + 1) + 1);

		for (int a = n1; a > minNum; a--) {
			for (int b = n1; b > minNum; b--) {
				o1 = a * b;
				// Check if list contains same or lower number than current max
				if (o1 % 11 != 0 || l1.contains(o1) || listMaxCheck(l1, o1))
					continue;

				// If number is palindrome, add to list
				if (stringCheck(o1)) {
					l1.add(o1);
					println(o1 + " added to list.");
				}
			}
			n1--;
		}
		// Output the highest palindrome from the list
		println("Highest palindrome is: " + findMax(l1));
		println((new Date().getTime() - start) + "ms");
	}

	static int findMax(List<Integer> list) {
		int maxNum = 0;
		// For each integer in list.
		for (int x : list) {
			// If the integer is greater than maxNum, make it new max
			if (x > maxNum)
				maxNum = x;
		}

		return maxNum;
	}

	static boolean listMaxCheck(List listCheck, int b) {
		int a = findMax(listCheck);
		if (a > b) {
			return true;
		}
		return false;
	}

	static boolean stringCheck(int a) {
		// Setup strings
		String s1 = "";
		s1 += a;

		// String2 == Reverse of String1
		String s2 = new StringBuilder(s1).reverse().toString();

		// Return true if both strings are equal each other.
		return s1.equals(s2);
	}

	// Methods to make printing easier.
	static void println(String text) {
		System.out.println(text);
	}
}
