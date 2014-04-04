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
public class Chapter2ExerciseTwoPointSeventeen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fTemp = input.nextDouble();
        System.out.print("Enter the wind speed miles per hour: ");
        double wSpeed = input.nextDouble();
        
        //double windChill = 35.74 + 0.6215 * fTemp - 35.75 * Math.pow(wSpeed, 0.16) + 0.4275 * fTemp * Math.pow(wSpeed, 0,16);
        double windChill = 35.74 + 0.6215 * fTemp - 35.75 * Math.pow(wSpeed,0.16) + 0.4275 * fTemp * Math.pow(wSpeed,0.16);
        
        System.out.println("The wind chill index is " + (int)(windChill * 100000) / 100000.0);
    }
    
}
