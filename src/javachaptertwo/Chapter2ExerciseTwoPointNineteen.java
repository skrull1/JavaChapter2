/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwoPointNineteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Generate random number
        byte rNumber = (byte)System.currentTimeMillis();
        rNumber = (byte)Math.abs(rNumber);
        System.out.println("Absolute value byte " + rNumber);
        System.out.println("The character cast of rNumber is " + (char)rNumber);
        
        
        // System.out.println((char)133);
        // System.out.println((char)126);
        //System.out.println((char)(Math.abs(((byte)System.currentTimeMillis()))));
    }
    
}
