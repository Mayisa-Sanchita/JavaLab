package TakingUserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner (System.in); 	
    	System.out.println("Enter some int number : ");
    	int user_input_Int= scan.nextInt(); //Taking an integer num as input    	
    	System.out.println("Entered value is : " + user_input_Int); //printing the int value
    	
    	Scanner scan1 = new Scanner (System.in); 	
    	System.out.println("Enter some double number : ");
    	double user_input_Double= scan1.nextDouble(); //Taking a double num as input    	
    	System.out.println("Entered value is : ");
    	System.out.print(user_input_Double + "\n"); //printing the double value
    	
    	Scanner scan2 = new Scanner (System.in); 	
    	System.out.println("Enter a string: ");
    	String user_input_string= scan2.nextLine(); //Taking a string as input    	
    	System.out.println("Entered string is : ");
    	System.out.print(user_input_string + "\n"); //printing the string
    	
    }
}
