/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javachaptertwo;

import java.util.Scanner;

// Experimenting with GIT
// More Experimenting with GIT

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwentyPointTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side: ");
        
        double s = input.nextDouble();
        
        double area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(s, 2);
        
        System.out.println("The area of the hexagon is " + (int)(area * 10000) / 10000.0);
        System.out.println("Experimenting with GIT");
    }
    
}
