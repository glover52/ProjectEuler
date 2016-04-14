public class a09 {
	/*
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c
	 * for which, a2 + b2 = c2.
	 *
	 * For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 *
	 * Answer: 31875000
	 * Time: 891ms
	 */

    private int a, b, c, product;

	public static void main(String[] args) {
        // Start timer to test efficiency
        final long start = System.currentTimeMillis();

        // Create new problem object
        a09 problem = new a09();

        // Find Pythagorean triplet
        problem.pyTriplet(1000);

        // Output difference of timer for efficiency
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private void pyTriplet(int limit) {
        for(a = 0; a < (int) limit / 3; ++a)
            for(b = 0; b < (int) limit / 2; ++b) {
                if (b <= a)
                    continue;

                for (c = 0; c < limit; ++c) {
                    if (c <= b)
                        continue;

                    if (numCheck()) {
                        product = (a * b * c);
                        System.out.printf("a: %d, b: %d, c: %d\nProduct: %d\n", a, b, c, product);
                    }
                }
            }
    }
	
	private boolean numCheck() {
		// Check if 'c' is greater than 'b' which should be greater than 'a'
        if(a < b && b < c)
            // Check if given numbers are a Pythagorean triplet
			if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
				if(a + b + c == 1000)
					return true;
		
		return false;
	}
}
