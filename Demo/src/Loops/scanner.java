package Loops;

import java.util.Scanner;

public class scanner {

	public static void main(String [] args)
	{
	
	int correctpin=1234;
	System.out.println("please enter your pin");
	Scanner k= new Scanner(System.in);
	int enteredpin=k.nextInt();
	while(correctpin!= enteredpin)
	{
	System.out.println("PLease enter the correct pin");
	enteredpin=k.nextInt();
	}
	System.out.println("You have entered the correct pin");
	}
}
