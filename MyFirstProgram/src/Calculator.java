
public class Calculator {
	
	
	// this method will allow our calculator object to add 2 numbers 
	
	public float add(int x, int y) {
		
		return x + y; //return the addition of the 2 arguments
		
	}
	
	// this method will allow our calculator object to subtract 2 numbers
	
	public float subtract (int x, int y) {
		
		return x - y;
	}
	
	// this method will allow our calculator object to multiply 2 numbers
	
	public float multiply(int x, int y) {
		return x * y;	
	}
	
	// this method will allow our calculator object to divide 2 numbers
	
	public float divide(int x, int y) {	
		return x / y;
	}
	
	// this method will allow our calculator object to mod 2 numbers
	
	public float mod(int x , int y) {
		return x % y; // returns the remainder 
	}
	
	public int GreatestMultiple (int x) {
		
		int result = 0;
		
		for (int i = 1; i < x ; i++) {
			
			if (x % i == 0) {
				result = i;
			}
				
		}
		
		
		return result;
	}
	
	
}
