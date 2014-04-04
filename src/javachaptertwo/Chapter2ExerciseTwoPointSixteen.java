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
public class Chapter2ExerciseTwoPointSixteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double iKilograms = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double iTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double fTemperature = input.nextDouble();
        
        double energyNeeded = iKilograms * (fTemperature - iTemperature) * 4184;
        
        System.out.print("The energy needed is " + (float)energyNeeded);
    }
    
}
