package PolyMorphism;

public class animal {
	
	public static void main(String[] args) {
		
		dog dog1 = new dog();
		animal animal1 = new animal();
		
		cat cat1 = new cat();
	
		
		dog1.legs(4);
		
	}

	public void eats() {
		System.out.println("The animal is eating");
	}

	public void sleep() {
		System.out.println("The animal is sleeping");
	}
	
	public void legs() {
		
		System.out.println("This animal has 2 legs");
	}
	
	public void call() {
		System.out.println("ROAR!");
	}


}

class dog extends animal {
	
	public void call() {
		System.out.println("WOOF!");
	}
	
	public void legs(int legCount) {
		
		System.out.println("This dog has " + legCount + " legs");
	}
	

}

class cat extends animal {
	
	public void call() {
		System.out.println("MEOW!");
	}
	
	
}




