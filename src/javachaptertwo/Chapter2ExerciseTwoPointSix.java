/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.Scanner;

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwoPointSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Prompt User to enter digits
        System.out.println("Enter a number between 0 and 1000: ");
        int numberEntered = input.nextInt();
        
        // Get first number
        int sumNumber = numberEntered % 10;
        
        //System.out.println("The first remainder is: " + sumNumber);
        int remainingNumber = numberEntered / 10;
        
        sumNumber += remainingNumber % 10;
        //System.out.println("The first remainder added to the second remainder equals " + sumNumber);
        
        remainingNumber = remainingNumber / 10;
        sumNumber += remainingNumber % 10;
        //System.out.println("The first, second and third remainder added is " + sumNumber);
        
        remainingNumber = remainingNumber / 10;
        sumNumber += remainingNumber % 10;
        
        System.out.println("The sum of the digits is " + sumNumber);
        
    }
    
}
