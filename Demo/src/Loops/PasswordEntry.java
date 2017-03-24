package Loops;

import java.io.*;
import java.util.*;

public class PasswordEntry
{
    public static void main (String [] args)
    {
        final String PASSWORD = "Test";

        for (int passAttempts = 0; passAttempts < 3; passAttempts++) 
        {
            System.out.print("\nEnter Your Password: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            if (!(inputPass.equals(PASSWORD))) 
            {
                System.out.println("\nWrong Password Try Again");
            } 
            else 
            {
                System.out.println("\nWelcome!");
                break;
            }
        }
    }
}