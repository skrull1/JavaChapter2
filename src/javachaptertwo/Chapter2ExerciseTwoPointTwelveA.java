/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwoPointTwelveA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create Decimal Format Object
        DecimalFormat df = new DecimalFormat("#.#####");
        String sBalance = JOptionPane.showInputDialog("Enter balance");
        double balance = Double.parseDouble(sBalance);
        String sInterestRate = JOptionPane.showInputDialog("Enter interest rate e.g., 3 for 3%");
        double interestRate = Double.parseDouble(sInterestRate);
        // double tInterest = (int)(balance * interestRate / 1200.0 * 100000) / 100000.0 ;
        double tInterest = balance * interestRate / 1200;
        
        
        String output = "The interest is " + df.format(tInterest);
        JOptionPane.showMessageDialog(null, output);
    }
    
}
