package lab4;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Factorial Calculator!");
		
		System.out.print("Enter an integer that's greater than 0 but less than 10: ");
			
		long i, result = 1;
	    int x = input.nextInt();
	    String choice = "yes";
	    
	    while (choice.equalsIgnoreCase("yes")){

		for (i = 1; i <= x; i++){
			result = result*i;
	}		
		System.out.println("The Factorial of " + x + " is  " + result);

	    System.out.println("Continue: (yes/no)");
	    choice = input.nextLine();
	    choice = input.nextLine();
	    }	    
}
}

