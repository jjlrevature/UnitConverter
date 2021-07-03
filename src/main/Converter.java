package main;

// import Scanner object
import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		// call the initial menu
		topMenu();
		
		//instantiate a new scanner
		Scanner scan = new Scanner(System.in);
		
		
		//assign user input to variable
		int topMenu = scan.nextInt();	
		
		/*
		 * Determine which unit conversion the user wants to utilize, 
		 * through the use of 2 separate menu's.
		 * Assign user input to a variable and pass it to a method.
		 * Allows user to input a new variable and switches accordingly.		 * 		 
		 */
		
		
		
		alpha: while(topMenu != 3) {
			switch(topMenu) {
			
			case 1:
				firstMenuTxt();
				int firstSelection = scan.nextInt();
				
				// If statement will break alpha while loop
				if(firstSelection == 3) 
					break alpha;	
				
				//Prompts user to second level menu
				while(firstSelection != 3) {
					switch(firstSelection) {
					case 1 :
						// Inches to Hertz
						System.out.println("Please enter a number in inches");
						double input1 = scan.nextInt();
						System.out.println(input1 + "in in hertz is: " + resultFrequency(input1) + "hz \n" );	
						firstSelection = 3;
						break;
					case 2 : 
						// Hertz to Inches
						System.out.println("Please enter a frequency in hertz");
						double input2 = scan.nextInt();
						System.out.println(input2 + " Hz is equivalant to " + resultWavelength(input2) + " inches \n");	
						firstSelection = 3;
						break;
					case 3:
						break alpha;
					}	
				}				
				break;
			case 2:
				secondMenuTxt();
				int secondSelection = scan.nextInt();
				
				// If statement will break alpha while loop
				if(secondSelection == 3)
					break alpha;
				
				//Prompts user to second level menu
				while(secondSelection != 3) {
					switch(secondSelection) {
					case 1 : 
						// Fahrenheit to Celsius
						System.out.println("Please enter a degree in Fahrenheit");
						double input3 = scan.nextInt();
						System.out.println(input3 + " degrees Fahreneheit is equavalant to " + resultCelcius(input3) + " degrees Celcius \n");
						secondSelection = 3;
						break;
					case 2 :
						// Celsius to Fahrenheit
						System.out.println("Please enter a degree in Celsius");
						double input4 = scan.nextInt();
						System.out.println(input4 + " degrees Celsius is equivalant to " + resultFahren(input4) + " degrees Fahrenheit \n");
						secondSelection = 3;
						break;					
					}
				}
				break;			
			default :
				System.out.println("Please enter a valid number");
				topMenu = scan.nextInt();
			}	
			
			// Will prompt user to start again assuming they have not chosen to exit
			if(topMenu == 3) {
				break alpha;
			} else {
			topMenu();
			topMenu= scan.nextInt();
			}
		
		}
		System.out.println("Jobs Dont! (Application Closing)");
		scan.close();
	}
	
	private static void topMenu() {			
		System.out.println("Please Select a number corresponding to an option: ");
		System.out.println(" 1) Wavelength and Frequency Conversions");
		System.out.println(" 2) Fahrenheit and Celcius Conversions");
		System.out.println(" 3) Exit Application");			
	}
	
	private static void firstMenuTxt() {
		System.out.println("Please Select a number corresponding to an option: ");
		System.out.println(" 1) Wavelength to Frequency Conversions");
		System.out.println(" 2) Frequency to Wavelength Conversions");
		System.out.println(" 3) Exit Application");			
	}
	
	private static void secondMenuTxt() {
		System.out.println("Please Select a number corresponding to an option: ");
		System.out.println(" 1) Fahrenheit to Celsius Conversions");
		System.out.println(" 2) Celsius to Fahreneheit Conversions");
		System.out.println(" 3) Exit Application");			
	}
	private static double resultFahren(double num) {
		return (num * (9/5)) + 32;
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
}


//
//while(menuSelection != 5) {
//	switch(menuSelection) {
//		
//	case 1 :
//		System.out.println("Please enter a number in inches");
//		double input1 = scan.nextInt();
//		System.out.println(input1 + "in in hertz is: " + resultFrequency(input1) + "hz \n" );
//		mainMenu();
//		menuSelection = scan.nextInt();
//		break;
//	case 2 :
//		System.out.println("Please enter a frequency in hertz");
//		double input2 = scan.nextInt();
//		System.out.println(input2 + " Hz is equivalant to " + resultWavelength(input2) + " inches \n");				
//		mainMenu();
//		menuSelection = scan.nextInt();
//		break;
//	case 3 :
//		System.out.println("Please enter a degree in Fahrenheight");
//		double input3 = scan.nextInt();
//		System.out.println(input3 + " degrees Fahrenehight is equavalant to " + resultCelcius(input3) + " degrees Celcius \n");
//		mainMenu();
//		menuSelection = scan.nextInt();
//		break;
//	case 4 :
//		System.out.println("Please enter a degree in Celsius");
//		double input4 = scan.nextInt();
//		System.out.println(input4 + " degrees Celsius is equivalant to " + resultFahren(input4) + " degrees Fahrenheight \n");
//		mainMenu();
//		menuSelection = scan.nextInt();
//		break;
//	default: 
//		System.out.println(" \n Please select a corresponding number ( 1 through 4 ) \n");
//		mainMenu();
//		menuSelection = scan.nextInt();
//	}
//		
//}	
//scan.close();
//
//if (menuSelection == 5) 
//	System.out.println("\n Job's Done! (Application Closed)");
//
//

// wavelength = speed/frequency

