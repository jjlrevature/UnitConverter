package main;

// import Scanner object
import java.util.Scanner;
import java.util.InputMismatchException;

public class Converter {
	
	
	public static void main(String[] args) {
		
		
		//instantiate a new scanner
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Determine which unit conversion the user wants to utilize, 
		 * through the use of 2 separate menu's.
		 * Validate users inputs.
		 * Assign user input to a variable and pass it to a method.
		 * Allows user to input a new variable and switches accordingly.		 * 		 
		 */
		
		//assign placeholder value		
		int topMenu = 5;	
		
		
		
		alpha: while(topMenu != 3) {
			
			// call the initial menu
			topMenu();
			
			
			topMenu = userInput(topMenu, scan);
			
			switch(topMenu) {
			
			case 1:
				firstMenuTxt();
				int firstSelection = userInput(topMenu, scan);
				
				// If statement will break alpha-while loop
				if(firstSelection == 3) 
					break alpha;	
				
				//Prompts user to second level menu
				while(firstSelection != 3) {
					switch(firstSelection) {
					case 1 :
						// Inches to Hertz
						System.out.println("Please enter a number in inches");
						double input1 = userInput(firstSelection, scan);
						System.out.println(input1 + " in in hertz is: " + resultFrequency(input1) + "hz \n" );	
						firstSelection = 3;							
						break;
					case 2 : 
						// Hertz to Inches
						System.out.println("Please enter a frequency in hertz");
						double input2 = userInput(firstSelection, scan);
						System.out.println(input2 + " Hz is equivalant to " + resultWavelength(input2) + " inches \n");	
						firstSelection = 3;
						break;
					default: 
						System.out.println(" Please enter a valid number");
						firstSelection = userInput(topMenu, scan);					
					}
				}				
				break;
			case 2:
				secondMenuTxt();
				int secondSelection = userInput(topMenu, scan);
				
				// If statement will break alpha while loop
				if(secondSelection == 3)
					break alpha;
				
				//Prompts user to second level menu
				while(secondSelection != 3) {
					switch(secondSelection) {
					case 1 : 
						// Fahrenheit to Celsius
						System.out.println("Please enter a degree in Fahrenheit");
						double input3 = userInput(secondSelection, scan);
						System.out.println(input3 + " degrees Fahreneheit is equavalant to " + resultCelcius(input3) + " degrees Celcius \n");
						secondSelection = 3;
						break;
					case 2 :
						// Celsius to Fahrenheit
						System.out.println("Please enter a degree in Celsius");
						double input4 = userInput(secondSelection, scan);
						System.out.println(input4 + " degrees Celsius is equivalant to " + resultFahren(input4) + " degrees Fahrenheit \n");
						secondSelection = 3;
						break;
					default: 
						System.out.println(" Please enter a valid number");
						secondSelection = userInput(topMenu, scan);					
					}
				}
			default :	
			}	
			
			
			// Will break out of App if variable = 3
			if(topMenu == 3) 
				break alpha;
			
		
		}
		System.out.println("Jobs Dont! (Application Closing)");
		scan.close();
	}
	
	private static void topMenu() {			
		System.out.println("Please Select a number corresponding to an option: ");
		System.out.println(" 1) Wavelength and Frequency Conversions");
		System.out.println(" 2) Fahrenheit and Celcius Conversions");
		System.out.println(" 3) Exit Application \n");			
	}
	
	private static void firstMenuTxt() {
		System.out.println("Please Select a number corresponding to an option: ");
		System.out.println(" 1) Wavelength to Frequency Conversions");
		System.out.println(" 2) Frequency to Wavelength Conversions");
		System.out.println(" 3) Exit Application \n");			
	}
	
	private static void secondMenuTxt() {
		System.out.println("Please Select a number corresponding to an option: ");
		System.out.println(" 1) Fahrenheit to Celsius Conversions");
		System.out.println(" 2) Celsius to Fahreneheit Conversions");
		System.out.println(" 3) Exit Application \n");			
	}
	private static double resultFahren(double num) {
		return (9.0/5.0) * num + 32;
	}
	
	private static double resultCelcius(double num) {
		return (num - 32) * 0.5556;
	}
	
	private static double resultWavelength(double num) {
		return 1100 / num;
	}
	
	private static double resultFrequency(double num) {
		return num * 1100;
	}
	
	// Validates user input to be an integer using Scanner object  
	private static int userInput(int num, Scanner sc) {
		boolean b = true;
		while(b) {
		    try {
		        num = sc.nextInt();
		        b = false;
		    }
		    catch(InputMismatchException inEx) {
		        System.out.println("Invalid input. Please try again!");
		        sc.nextLine();	        
		    }
		}
		return num;
	}
}


// wavelength = speed/frequency

