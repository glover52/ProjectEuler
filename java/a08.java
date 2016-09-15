import java.io.*;
import java.util.ArrayList;

public class a08 {
    /*
     * The four adjacent digits in the 1000-digit number that have the
     * greatest product are 9 * 9 * 8 * 9 = 5832
     *
     * < 1000-digit number listed in a08.in >
     *
     * Find the thirteen adjacent digits in the 1000-digit number that
     * have the greatest product. What is tha value of this product?
     *
     * Answer: 23514624000
     * Time: 26ms
     */
    private int[] digits;

    public static void main(String args[]) {
        // Start timer for testing purposes
        final long start = System.currentTimeMillis();

        // Create new problem object
        a08 problem = new a08();

        // Read given input file
        problem.readFile("input/008.in");

        // Find the largest product of given 'n' numbers
        problem.findProduct(13);

        // Output total program time to console
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private void findProduct(int adj) {
        // Create variables for comparing largest product
        long current, largest = 0;

        // Pass through the x-digit number
        for(int i = 0; i < digits.length - adj + 1; ++i) {
            // Set current product to one
            current = 1;

            // Move through values to right of current number
            for(int j = 0; j < adj; ++j) {

                // If selected digit in array is zero, move whole list up
                if(digits[i+j] == 0) {
                    i += j;
                    break;
                }
                current *= digits[i + j];
            }

            // Compare current largest product with possible largest product
            largest = Math.max(largest, current);
        }

        // Output the largest product to the console
        System.out.printf("\nLargest product is: %d\n", largest);
    }

    private void readFile(String name) {
        ArrayList<Character> list = new ArrayList<Character>();

        try {
            File f = new File(name);
            BufferedReader br = new BufferedReader(new FileReader(f));

            String line;
            while((line = br.readLine()) != null)
                for (int i = 0; i < line.length(); ++i)
                    list.add(line.charAt(i));

            br.close();
        }
        catch(FileNotFoundException e) { System.out.println("File: " + name + " does not exist!"); }
        catch(IOException e) { e.printStackTrace(); }

        digits = new int[list.size()];
        for(int i = 0; i < digits.length; ++i)
            digits[i] = Integer.parseInt(Character.toString(list.get(i)));
    }
}
