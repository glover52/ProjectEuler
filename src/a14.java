public class a14 {
    /*
     * The following iterative sequence is defined for the set of positive integers:
     * n → n/2 (n is even)
     * n → 3n + 1 (n is odd)
     *
     * Using the rule above and starting with 13, we generate the following sequence:
     * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
     *
     * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
     * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers
     * finish at 1.
     *
     * Which starting number, under one million, produces the longest chain?
     *
     * NOTE: Once the chain starts the terms are allowed to go above one million.
     *
     * Answer: 837799
     * Time: 176ms
     */
    public static void main(String[] args) {
        // Record current system time for efficiency
        final long start = System.currentTimeMillis();

        // Create new problem object
        a14 problem = new a14();

        // Solve the given problem
        problem.collatz(1000000);

        // Output difference in time to console
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private void collatz(int input) {
        // Initalise storage variables
        long maxNum = 0;
        int maxLength = 0;

        // Decrement any even input
        if(input % 2 == 0)
            --input;

        for(long i = input; i > (int) Math.ceil(input / 1.25); i-=2) {
            long j = i;
            int curLength = 0;

            // Conduct the Collatz problem
            while(j > 1) {
                if(j % 2 == 0)
                    j = isEven(j);

                else
                    j = isOdd(j);

                ++curLength;
            }

            // Compare current highest chain with working chain length
            if(curLength > maxLength) {
                // Assign new max length to current length of chain
                maxLength = curLength;

                // Assign max number
                maxNum = i;
            }
        }

        // Output storage values in easy to read format
        System.out.printf("%d, Chain length: %d\n", maxNum, maxLength);
    }

    private long isEven(long i) {
        return i / 2;
    }

    private long isOdd(long i) {
        return 3 * i + 1;
    }
}
