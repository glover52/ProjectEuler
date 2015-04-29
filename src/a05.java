import java.util.Date;

public class a05 {
	/*
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of
	 * the numbers from 1 to 20?
	 */
	public static void main(String[] args) {
		// Begin timer
		long start = new Date().getTime();
		
		int[] range = new int[20];
		// Assigns incremental values to an array
		assignRange(range);
		
		int number = 0;
		
		//Check if number is able to be evenly divided by all values in range
		while(modCheck(number, range)) {
			number+=60;
		}
		
		// Output final number and time.
		System.out.println("The number is: " + number);
		System.out.println(new Date().getTime() - start + "ms");
	}
	
	public static void assignRange(int[] range) {
		// Assign values to range
		for(int i=0; i<range.length; i++) {
			range[i] = i+1;
		}
	}
	
	public static boolean modCheck(int number, int[] range) {
		// Check if value is able to be evenly divided by range
		for(int i=0; i<range.length; i++) {
			if(number%range[i] != 0 || number == 0) {
				return true;
			}
		}
		// Return 'false' if number is evenly divided
		return false;
	}

}
