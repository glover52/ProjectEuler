public class a01 {
	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of
	 * all the multiples of 3 or 5 below 1000.
	 *
	 * Answer: 233168
	 * 1ms
	 */
	public static void main(String[] args) {
		// Start time
		final long start = System.currentTimeMillis();

		// Setup values
		final int value = 1000;
		int totalValue = 0;

		for (int i = 0; i < value; i++) {
			// Add to total if 3 divides i with no remainder
			if (i % 3 == 0)
				totalValue += i;

			// Add to total if 5 divides i with no remainder
			else if (i % 5 == 0)
				totalValue += i;
		}

		// Output the total value
		System.out.println("Total Value: " + totalValue);

        // End time
        System.out.println(System.currentTimeMillis() - start + "ms");
	}

}
