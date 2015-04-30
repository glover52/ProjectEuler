import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class a07 {
	/*
	 * By listing the first six prime numbers:2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * What is the 10 001st prime number?
	 */
	public static void main(String[] args) {
		long start = new Date().getTime();
		// Set starting number and which primeNumber to find
		int number = 2, primeNumber = 10001;
		List<Integer> primes = new ArrayList<Integer>();

		// Create loop for finding prime number
		for (int i = 0; i < primeNumber; i++) {
			// Create loop that traps all numbers that aren't prime
			while (true) {
				if (isPrime(number, primes)) {
					// Add to list if number is prime and break
					primes.add(number);
					break;
				}
				number++;
			}
		}
		// Print output
		System.out.println(primeNumber + ": " + number);
		System.out.println(new Date().getTime() - start + "ms");
	}

	public static boolean isPrime(int number, List<Integer> primes) {
		// Check current number with prime list
		for (int i = 0; i < primes.size(); i++) {
			// If the number is evenly divisible by ANY prime, it is not a prime
			if (number % primes.get(i) == 0) {
				return false;
			}
		}
		return true;
	}
}
