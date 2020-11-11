
public class car {
	
	// global variable
	int wheelCount;
	
	public void honk() {
		
		// local variable
		int honkCount;
		
		System.out.print("The car has " + wheelCount + " wheels");
		
		System.out.print("The car honks" + honkCount + " times");
	}
	
	public void honk2() {
		
		System.out.print("The car honks" + wheelCount + " wheels");
		
		System.out.print("The car honks" + honkCount + " times");
	}


	public void honk3() {
		
		System.out.print("The car honks" + wheelCount + " wheels");
		
		System.out.print("The car honks" + honkCount + " times");
	}
}
