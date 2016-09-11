package lab4;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator!");
		
		Scanner input = new Scanner(System.in);
		
		String choice = "yes";
		while (choice.equals("yes")) {
			
			System.out.println("Enter an integer that's greater than 0 but less that 10:");
			int x = input.nextInt(); 
			
			
			 
			
			for (long i=0; i<=x; i++){
				return;
				
			}	
				System.out.println("Do you want to continue (yes or no):");
				input.nextLine();
				choice = input.nextLine();
			
		}

	}

}
