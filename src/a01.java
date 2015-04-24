public class a01 {	
	public static void main(String[] args) {
		
		// Setup values
		final int value = 1000;
		int totalValue = 0;
		
		
		for(int i=0; i<value; i++) {
			// Add to total if 3 divides i with no remainder
			if(i%3 == 0) {
				totalValue += i;
				continue;
			}
			// Add to total if 5 divides i with no remainder
			if(i%5 == 0) {
				totalValue += i;
			}
		}
		
		// Output the total value
		System.out.println("Total Value: " + totalValue);
	}

}
