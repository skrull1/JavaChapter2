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
public class Chapter2ExerciseTwoPointFourteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double poundsEntered = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightEntered = input.nextDouble();
        
        double bMI = (int)((poundsEntered * 0.45359237) / Math.pow(heightEntered * 0.0254, 2) * 10000) / 10000.0;
        
        System.out.println("BMI is "+ bMI);
        
                
    }
    
}
