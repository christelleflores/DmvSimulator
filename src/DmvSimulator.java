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
	
		//calls out numbers starting after the assigned random number to 200
		for (int i = result + 1; i <= 200; i++) {
			System.out.println(i);
		}
		//calls out numbers from 1 to the assigned random number
		for (int i = 1; i <= result; i++) {
			System.out.println(i);
		}
		

		Random rand2 = new Random();
		int low2 = 1;
		int high2 = 100;
		int result2 = rand2.nextInt(high2-low2) + low2;

		//tells the user they don't have the required and exits the program
		if(result2 == 1) {
			System.out.println("You have all the required documents and you're all set! Have a nice day!");
		} else {
		System.out.println("You don't have the required documents! You have to make another appointment and come again. Make sure you have the required documents and look at the checklist a couple times before coming. You wasted our time and booked an opening when someone else could've came instead with everything prepared beforehand. The exit is that way. Goodbye! Hahaha!");
		}
	}
}
