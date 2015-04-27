import java.util.ArrayList;
import java.util.List;

public class a03 {
	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
	 * factor of the number 600851475143?
	 */
	public static void main(String[] args) {

		// Setup initial values and create list for primes
		double mainValue = 600851475143.0;
		List<Integer> primes = new ArrayList<Integer>();
		long n = 0;
		int sqrtValue = (int) Math.ceil(Math.sqrt(mainValue));

		for (int i = 2; i < sqrtValue; i++) {
			// Check if value is prime and add to list if true
			if (isPrime(i, primes)) {
				primes.add(i);

				// Assign current prime number to be the highest
				if (mainValue % i == 0)
					n = i;
			}
		}
		System.out.println(n);
	}

	static boolean isPrime(int numCheck, List<Integer> primes) {
		// Check if prime list size is <= the square root of numCheck
		if (primes.size() <= Math.sqrt(numCheck))
			return true;

		// Check if the number can be divided by any prime
		for (int i = 0; i < Math.sqrt(numCheck); i++) {
			if (numCheck % primes.get(i) == 0)
				return false;
		}
		return true;
	}

}
