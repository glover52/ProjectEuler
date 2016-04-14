import java.util.Date;

public class a06 {
	/*
	 * The sum of the squares of the first ten natural numbers is,
	 * 12 + 22 + ... + 102 = 385
	 * The square of the sum of the first ten natural numbers is,
	 * (1 + 2 + ... + 10)2 = 552 = 3025
	 * 
	 * Hence the difference between the sum of the squares of the first ten
	 * natural numbers and the square of the sum is,
	 * 3025 − 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one
	 * hundred natural numbers and the square of the sum.
	 *
	 * Answer: 25164150
	 * Time: 1ms
	 */
	public static long sumSqrTotal = 0;
	public static long sqrSumTotal = 0;
	
	public static void main(String[] args) {
		long start = new Date().getTime();
		// Sets the value of natural numbers
		final long natAmount = 100;
		
		// Create sums for difference equation
		sumOfSqrs(natAmount);
		sqrOfSums(natAmount);
		
		// Output difference
		System.out.print("The total is: ");
		if(sqrSumTotal>sumSqrTotal)
			System.out.println(sqrSumTotal - sumSqrTotal);
		else
			System.out.println(sumSqrTotal - sqrSumTotal);
		
		// Output time
		System.out.println(new Date().getTime() - start + "ms");
	}
	
	public static void sumOfSqrs(long natAmount) {
		// Sums the squares of the first 'i' natural numbers
		for(int i=0; i<natAmount; i++) {
			sumSqrTotal += Math.pow(i+1, 2);
		}
	}
	
	public static void sqrOfSums(long natAmount) {
		// Squares the sum of the first 'i' natural numbers
		for(int i=0; i<natAmount; i++) {
			sqrSumTotal += (i+1);
		}
		sqrSumTotal = (int) Math.pow(sqrSumTotal, 2);
	}
}
