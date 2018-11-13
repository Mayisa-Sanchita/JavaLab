package Main;

import java.io.*;

/**
 * <h1>Arithmatic Operation Between Two Numbers</h1>
 * This program implements an application that
 * simply add two given integer numbers,
 * simply subtract two given integer numbers,
 * simply multiply two given integer numbers and print the outputs on the screen
 * <p>
 * <b>Note:</b> Comments about the program are given properly and I hope it will be assumed a high quality code.
 * 
 * @author Swazan
 * @version 1.0
 * @since 2018-10-29
 */
public class ArithmaticOperation {
	
	
	/**
	 * This method is used to add two integer numbers.
	 *  @param operand1 is the first parameter of AddNum method
	 *  @param operand2 is the second parameter of AddNum method
	 *  @return int This return sum of operand1 and operand2
	 */
	public static int addnum(int operand1 ,int operand2)
	{
		return operand1+operand2;
	}
	 
	/**
	 * This method is used to subtract from one integer numbers to another integer number.
	 *  @param operand1 is the first parameter of Subtract method
	 *  @param operand2 is the second parameter of Subtract method
	 *  @return int This return subtraction result from operand1 to operand2
	 */
	public static int subtract(int operand1 ,int operand2)
	{
		return operand1-operand2;
	}
	
	 /**
	 * This method is used to multiply two integer numbers.
	 *  @param operand1 is the first parameter of Multiply method
	 *  @param operand2 is the second parameter of Multiply method
	 *  @return int This return multiplication of operand1 and operand2
	 */
	
	 public static int multiply(int operand1 ,int operand2)
	{
		return operand1*operand2;
	}
		


public static void main(String[] args) {
	/**
	 * Here we have declared Two variables named Operand1
	 * and Operand2 for doing some arithmatic operation
	 */
	int operand1=10;
	int operand2=15;
	/**
	 * Here we are printing the summation of operand1 and operand2
	 */
	
	 System.out.println(addnum(operand1,operand2));
	 
	/**
	 * Here we are printing the subtraction from operand1 to operand2
	 */
	
	 System.out.println(subtract(operand1,operand2));
	
	/**
	 * Here we are printing the multiplication of operand1 and operand2
	 */
	
	 System.out.println(multiply(operand1,operand2));
	
}
}