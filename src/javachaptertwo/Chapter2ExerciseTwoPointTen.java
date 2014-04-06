/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwoPointTen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create Scanner object
        
        //Scanner input = new Scanner(System.in);
        
        // Receive the amount
        //System.out.print("Enter an amount in integer, for example 1156: ");
        //double amount = input.nextDouble();
        //int amount = input.nextInt(); 
        
        String amountEnteredString = JOptionPane.showInputDialog("Enter an amount in integer, for example 1156:");
        
        
        
        int remainingAmount = Integer.parseInt(amountEnteredString);
        
        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        // Find the numer of quarters in the remaing amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        // Find the number of nickels in the remaining amount
        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        
        // Display results
        //System.out.println("Your amount " + amountEnteredString + " consists of \n" + "\t" + numberOfOneDollars + " dollars\n" + "\t" + numberOfQuarters + " quarters\n" + "\t" + numberOfDimes + " dimes\n" + "\t" + numberOfNickles + " nickles\n" + "\t" + numberOfPennies + " pennies");
        String output = "Your amount " + amountEnteredString + " consists of \n" + "\t" + numberOfOneDollars + " dollars\n" + "\t" + numberOfQuarters + " quarters\n" + "\t" + numberOfDimes + " dimes\n" + "\t" + numberOfNickles + " nickles\n" + "\t" + numberOfPennies + " pennies";
        JOptionPane.showMessageDialog(null, output);
        
    }
    
}
