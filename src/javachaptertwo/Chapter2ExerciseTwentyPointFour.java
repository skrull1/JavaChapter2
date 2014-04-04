/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javachaptertwo;

import java.util.Scanner;

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwentyPointFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter v and a: ");
        
        double v = input.nextDouble();
        double a = input.nextDouble();
        
        double length = Math.pow(v, 2) / (2 * a);
        
        System.out.print("The minimum runway length for this airplane is " + (int)(length * 1000) / 1000.0);
    }
    
}
