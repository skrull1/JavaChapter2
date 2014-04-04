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
public class Chapter2ExerciseTwoPointThirteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double iAmount = input.nextDouble();
        System.out.print("Enter monthly interst rate: ");
        double mInterest = input.nextDouble();
        mInterest = mInterest / 1200;
        System.out.print("Enter number of years: ");
        int nYears = input.nextInt();
        double cInterest = 1 + mInterest;
        double cYears = nYears * 12;
        
        double futureInvestmentValue = iAmount * Math.pow(cInterest, cYears);
        System.out.println("Accumulated value is " + (int)(futureInvestmentValue * 100) / 100.0);
        

    }
    
}
