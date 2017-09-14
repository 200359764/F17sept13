
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seunghwan Kim
 */
public class Average {
    public static void main(String[] args)
    {
        //this defines 4 variables that can hold decimal numbers
        double num1, num2, num3, avg;
        
        //this defines a Scanner object called "keyboard" so we can get user input
        Scanner keyboard = new Scanner(System.in) ;
        
        //Ask the user to enter 3 numbers
        System.out.print("Please enter the first number: ") ;
        num1 = keyboard.nextDouble() ;
        
        System.out.print("Please enter the second number: ") ;
        num2 = keyboard.nextDouble() ;
        
        System.out.print("Please enter the third number: ") ;
        num3 = keyboard.nextDouble() ;
                
        // The program will calculate the average of the 3 numbers
        avg = (num1 + num2 + num3)/3 ;
                
        // The program will display the average of the 3 numbers to the screen
        System.out.printf("The average of the numbers is %.1f%n", avg) ;
        
        
    }        
}
