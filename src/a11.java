import java.io.*;

public class a11 {
    /*
     * The product of these numbers is (8,6) 26 × (9,7) 63 × (10,8) 78 × (11,9)14 = 1788696.
     *
     * What is the greatest product of four adjacent numbers in the same direction
     * (up, down, left, right, or diagonally) in the 20×20 grid?
     *
     * Answer: 70600674
     * Time: 6ms
     */
    int[][] grid = new int[20][20];

    public static void main(String[] args) {
        // Record current system time for efficiency findProduct
        final long start = System.currentTimeMillis();

        // Create new problem object
        a11 problem = new a11();

        // Read input file and assign numbers to array
        problem.readFile("a11.in");

        // Find the greatest product of n adjacent numbers
        problem.findProduct(4);

        // Output difference in time to console
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private void findProduct(int adjacent) {
        // If adjacent numbers to calc is > grid length, it's impossible to do
        if(adjacent > grid[0].length)
            System.exit(-1);

        // Create long numbers for comparisons
        long product = 0, current = 1;

        /*
         * In the four tests below, each test uses grid[i][j]
         * with 'i' being the y value and 'j' being the x value.
         *
         * Each test
         */

        // Horizontal Test
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid.length - adjacent + 1; ++j) {
                for(int k = 0; k < adjacent; ++k) {
                    current *= grid[i][j + k];
                }

                product = Math.max(product, current);
                current = 1;
            }
        }

        // Vertical Test
        for(int i = 0; i < grid.length - adjacent + 1; ++i) {
            for(int j = 0; j < grid.length; ++j) {
                for(int k = 0; k < adjacent; ++k)
                    current *= grid[i + k][j];

                product = Math.max(product, current);
                current = 1;
            }
        }

        // Diagonal Test - TL to  BR
        for(int i = 0; i < grid.length - adjacent + 1; ++i) {
            for(int j = 0; j < grid.length - adjacent + 1; ++j) {
                for(int k = 0; k < adjacent; ++k)
                    current *= grid[i + k][j + k];

                product = Math.max(product, current);
                current = 1;
            }
        }

        // Diagonal Test - TR to BL
        for(int i = 0; i < grid.length - adjacent + 1; ++i) {
            for(int j = adjacent - 1; j < grid.length; ++j) {
                for(int k = 0; k < adjacent; ++k)
                    current *= grid[i + k][j - k];

                product = Math.max(product, current);
                current = 1;
            }
        }

        // Output greatest calculated product from adjacent numbers
        System.out.println(product);
    }

    private void readFile(String name) {
        // Create and initialise 2D String array to input lines
        String[][] gridString = new String[grid.length][grid.length];

        try {
            // Create new file object
            File f = new File(name);

            // Create reader to read file lines
            BufferedReader br = new BufferedReader(new FileReader(f));

            // Create String to store given line
            String line;

            // Create iterator for array assignment
            int i = 0;
            while((line = br.readLine()) != null) {
                // Split the given line into an array
                gridString[i] = line.split(" ");

                // Increment iterator
                ++i;
            }

            // Close the reader
            br.close();
        }

        catch(FileNotFoundException e) { System.out.println("File: " + name + " does not exist!"); }
        catch(IOException e) { e.printStackTrace(); }

        // Convert given strings to int and add to same location in 2D int array
        for(int i = 0; i < grid.length; ++i)
            for(int j = 0; j < grid.length; ++j)
                grid[i][j] = Integer.parseInt(gridString[i][j]);
    }




}
