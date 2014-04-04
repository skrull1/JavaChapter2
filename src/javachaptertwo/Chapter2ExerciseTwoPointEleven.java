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
public class Chapter2ExerciseTwoPointEleven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Create Scanner object
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Employee\'s name: ");
        String eName = input.next();
        System.out.print("Enter number of hours worked: ");
        double wHours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double sTax = input.nextDouble();
        
        double gPay = wHours * hPayRate;
        double fTaxCalc = gPay * fTax;
        double sTaxCalc = gPay * sTax;
        double tTax = (int)(fTaxCalc * 100) / 100.0 + (int)(sTaxCalc * 100) / 100.0;
        double nPay = ((int)(gPay * 100) / 100.0) - tTax;
        
        System.out.println("Employee Name: " + eName);
        System.out.println("Hours worked: " + wHours);
        System.out.println("Pay Rate: $" + hPayRate);
        System.out.println("Gross Pay: $" + gPay );
        
        System.out.print("Deductions:");
        System.out.print("\n Federal Withholding (" + fTax * 100 + "%):  " + "$" + (int)(fTaxCalc * 100) / 100.0);
        System.out.print("\n State Withholding (" + sTax * 100 + "%): " + "$" + (int)(sTaxCalc * 100) / 100.0);
        System.out.print("\n Total Deduction: $" + tTax  + "\n");
        System.out.print("Net Pay: $" + nPay);
    }
    
}
