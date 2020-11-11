import java.util.ArrayList;

public class Examples11_9 {
	
	
	public static void main(String[] args) { 
	
	int[] array = new int[5];
	
	try {
		array[0] = 12;
		array[1] = 1223;
		array[2] = 121323;
		array[4] = 1231213;
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Trying to access a space in array which does not exist. Try another index!");
		return;
	}
	
	System.out.print("Congrats! No Exceptions met");
			
	}
	

}
