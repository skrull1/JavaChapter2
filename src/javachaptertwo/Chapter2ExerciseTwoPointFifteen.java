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
public class Chapter2ExerciseTwoPointFifteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double accountValue = 100;
        accountValue = 100 * (1 + 0.00417);
        System.out.println("First Month: " + (int)(accountValue * 1000) / 1000.0);
        accountValue = (100 + accountValue) * (1 + 0.00417);
        System.out.println("Second Month: " +(int)(accountValue * 1000) / 1000.0);
        accountValue = (100 + accountValue) * (1 + 0.00417);
        System.out.println("Third Month: " + (int)(accountValue * 1000) / 1000.0);
        accountValue = (100 + accountValue) * (1 + 0.00417);
        System.out.println("Fourth Month: " + (int)(accountValue * 1000) / 1000.0);
        accountValue = (100 + accountValue) * (1 + 0.00417);
        System.out.println("Fifth Month: " +(int)(accountValue * 1000) / 1000.0);
        accountValue = (100 + accountValue) * (1 + 0.00417);
        System.out.println("Sixth Month: " + (int)(accountValue * 1000) / 1000.0);
    }
    
}
