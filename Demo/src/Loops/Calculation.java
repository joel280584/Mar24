package Loops;

import java.util.Scanner;

public class Calculation {
public static void main(String []args){
	Scanner k=new Scanner(System.in);
	try
	{
	System.out.println("please enter the first number");
	int num1=k.nextInt();
	
	System.out.println("please enter the second number");
	int num2=k.nextInt();
	
	System.out.println("Result of division" +num1+ "with" + num2 + "=" + (num1/num2));
	
	}
	catch(ArithmeticException e){
	System.out.println("pLease do not enter a zero in the denominator");
	}
	catch(Exception e){
		System.out.println("Please enter a valid input");
	}
}
}
