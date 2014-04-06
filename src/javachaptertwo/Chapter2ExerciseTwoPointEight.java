/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwoPointEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create Scanner object
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an ASCII code: ");
        int codeEntered = input.nextInt();
        
        System.out.println("The character for ASCII code " + codeEntered + " is " + (char)codeEntered);
    }
    
}
