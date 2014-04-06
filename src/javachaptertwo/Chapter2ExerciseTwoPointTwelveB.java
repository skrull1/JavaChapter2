/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwoPointTwelveB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Create Decimal Format Object
        DecimalFormat df = new DecimalFormat("#.#####");
        
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interest = input.nextDouble();
        double tInterest = balance * interest / 1200;
        System.out.println("The interest is " + df.format(tInterest));
    
    }
    
}
