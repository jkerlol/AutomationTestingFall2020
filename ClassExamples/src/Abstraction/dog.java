package Abstraction;

public class dog implements animal {

	public void call() {
		System.out.println("WOOF WOOF!");
	}
	
	
	public void walk() {
		System.out.println("THE DOG IS NOW WALKING! STEP STEP");
	}


	@Override
	public void eats() {
		System.out.println("Your dog is now eating kibble!");
	}
}
