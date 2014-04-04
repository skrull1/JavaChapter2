/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package test;

import java.util.Scanner;

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwoPointTwentyOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three points of a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double side1 = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
        double side2 = Math.pow((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)), 0.5);
        double side3 = Math.pow((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)), 0.5);
        
        double s = (side1 + side2 + side3) / 2;
        
        double area = Math.pow((s * (s - side1) * (s - side2) * (s-side3)), 0.5);
        //System.out.println("Side1 equals " + side1);
        //System.out.println("Side2 equals " + side2);
        //System.out.println("Side3 equals " + side3);
        
        System.out.println("The area of the triangle is " + (int)(area * 10) / 10.0);
    }
    
}
