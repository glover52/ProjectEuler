import java.io.*;
import java.math.BigInteger;

/*
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 *  - List of one-hundred 50 digit numbers -
 *  Answer: 5537376230
 *  Time: 20ms
 */
public class a13 {
    Double bigNumber = 0D;

    public static void main(String[] args) {
        // Record current system time for efficiency
        final long start = System.currentTimeMillis();

        // Create new problem object
        a13 problem = new a13();

        // Read the file and output final number
        problem.readFile("a13.in");

        // Output difference in time to console
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private void readFile(String name) {
        try {
            // Create new file object
            File f = new File(name);

            // Create reader to read file lines
            BufferedReader br = new BufferedReader(new FileReader(f));

            // Create String to store given line
            String line;

            // Create iterator for array assignment
            while((line = br.readLine()) != null) {
                // Split the given line into an array
                bigNumber += Double.parseDouble(line);
            }

            // Output number - For better time / Less readable
            System.out.println(bigNumber);

            // Close the reader
            br.close();
        }

        catch(FileNotFoundException e) { System.out.println("File: " + name + " does not exist!"); }
        catch(IOException e) { e.printStackTrace(); }
    }
}
