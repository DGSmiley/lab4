package lab4;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Header
		System.out.println("Welcome to the Factorial Calculator!");
		
		//User input
		System.out.print("Enter an integer that's greater than 0 but less than 10: ");
		
		//Set values
		long i, result = 1;
	    int x = input.nextInt();
	    String choice = "yes";
	    
	    //begin while loop
	    while (choice.equalsIgnoreCase("yes")){

	    // for loop to calculate factorial
		for (i = 1; i <= x; i++){
			result = result*i;
	}		
		//print out of result
		System.out.println("The Factorial of " + x + " is  " + result);

		//continue option
	    System.out.println("Continue: (yes/no)");
	    choice = input.nextLine();
	    choice = input.nextLine();
	    }	    
}
}

