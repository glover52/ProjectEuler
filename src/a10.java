import java.util.ArrayList;

public class a10 {
    /*
     * The sum of the primes below 10 is '2 + 3 + 5 + 7 = 17'
     * Find the sum of all the primes below two million.
     * Answer: 142913828922
     * Time: 4770ms
     */
    private ArrayList<Integer> primes = new ArrayList<Integer>();

    public static void main(String args[]) {
        // Start timer for testing purposes
        final long start = System.currentTimeMillis();

        // Create new problem object
        a10 problem = new a10();

        // Find sum of all the primes below given number
        problem.sumOfPrimes(2000000);

        // Output total program time to console
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private void sumOfPrimes(int limit) {
        long sum = 2;
        for(int i = 3; i < limit; i+=2) {
            // Only odd numbers (+ two) can be prime
            if(i % 2 == 0)
                continue;

            // Add number to prime list and sum if prime
            if(isPrime(i)){
                primes.add(i);
                sum += i;
            }
        }

        System.out.printf("Sum of %d primes under %d: %d\n", primes.size(), limit, sum);
    }

    private boolean isPrime(int n) {
        // Check for empty prime list
        if(primes.size() < 1)
            primes.add(2);

        // Check if prime list size is <= the square root of numCheck
        if (primes.size() <= Math.sqrt(n))
            return true;

        // Check if number can be divided by any prime
        for (int i = 0; i < Math.sqrt(n) && i < primes.size(); ++i)
            if (n % primes.get(i) == 0)
                return false;

        return true;
    }
}
