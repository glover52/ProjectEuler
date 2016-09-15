import java.math.BigInteger;

public class a16 {
    /*
     * 2^(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
     *
     * What is the sum of the digits of the number 2^(1000)?
     *
     * Answer: 1366
     * Time: 99ms
     */
    public static void main(String[] args) {
        // Record current system time for efficiency
        final long start = System.currentTimeMillis();

        // Create new problem object
        a16 problem = new a16();

        // Find the total sum of the digits within 2^n
        problem.findSum(1000);

        // Output difference in time to console
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private void findSum(long input) {
        // Create a BigInteger variable and initialise as zero
        BigInteger bi = BigInteger.ZERO;

        // Add two to the power of given input to BigInt and convert to String array
        final String[] sInput = bi.add(powOf(2, input)).toString().split("");

        // Initialise number to count digits
        int number = 0;

        // Go through digits to find sum
        for(int i = 0; i < sInput.length; ++i)
            number += Integer.parseInt(sInput[i]);

        // Output the total sum of digits
        System.out.printf("Value: %d\n", number);
    }

    /**
     * Due to constraints of long and double, a custom method that acts similar to 'Math.pow()'
     * needs to be created so that it returns a BigInteger rather than a double.
     * @param number
     * @param power
     * @return
     */
    private BigInteger powOf(int number, long power) {
        BigInteger bi = BigInteger.ONE;

        for(long i = 0; i < power; ++i) { bi = bi.multiply(BigInteger.valueOf(number)); }

        return bi;
    }
}
