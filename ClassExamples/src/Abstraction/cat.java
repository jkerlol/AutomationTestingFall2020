package Abstraction;

public class cat implements animal {
	
	public void call() {
		System.out.println("MEOW MEOW!");
	}
	
	public void walk() {
		System.out.println("THE CAT IS NOW WALKING! PITTER PATTER");
	}

	@Override
	public void eats() {
		System.out.println("Your cat is now eatng fish!");
	}
	
}
