public class a02 {
	public static void main(String[] args) {
		
		// Setup initial values
		final int limit = 4000000;
		int totalValue = 0;
		int xValue, yValue, zValue = 0;
		yValue = zValue;
		xValue = 1;
		
		while(yValue+xValue < limit) {
			// Create the Fibonacci sequence
			zValue = yValue + xValue;
			xValue = yValue;
			yValue = zValue;
			
			if(zValue%2 == 0)
				// Add even values to totalValue
				totalValue += zValue;
		}
		
		// Output total value of all even numbers in sequence under the limit.
		System.out.println(zValue);
		System.out.println(totalValue);
	}

}
