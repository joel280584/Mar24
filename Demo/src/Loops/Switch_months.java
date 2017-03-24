package Loops;

import java.util.Scanner;

public class Switch_months {
	
	public static void main(String [] args)
	{
		System.out.println("pLeae enter a month");
	Scanner k= new Scanner(System.in);
	int month=k.nextInt();
	
	switch(month){
	case 1:
		System.out.println("January");
		break;
	case 2:
		System.out.println("feb");
		break;
	case 3:
		System.out.println("march");
		break;
	case 4:
		System.out.println("april");
		break;
	case 5:
		System.out.println("may");
		break;
	
	
	}
}
}