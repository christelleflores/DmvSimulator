import java.util.Random;

public class DmvSimulator {

	public static void main(String[] args) {
		System.out.println("Hello and welcome to the DMV of CSC109!");
		
		//Generate random number
		Random rand = new Random();
		int low = 1;
		int high = 100;
		int result = rand.nextInt(high-low) + low;
		System.out.println("Your number is: " + result + ". Please wait until your number is called.");
	
		//calls out numbers starting after the assigned random number to 100
		for (int i = result + 1; i <= 100; i++) {
			System.out.println(i);
		}
		//calls out numbers from 1 to the assigned random number
		for (int i = 1; i <= result; i++) {
			System.out.println(i);
		}
		
		//tells the user they don't have the required and exits the program
		System.out.println("Unfortunately, you don't have the required. Have a good day, goodbye!");
		
	}

}
