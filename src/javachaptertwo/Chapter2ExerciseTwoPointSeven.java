/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwoPointSeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create Scanner object
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        
        int years = minutes / 525600;
        int rYears = minutes % 525600;
        int days = rYears / 1440;
        
        //System.out.println("Remainder years: " + rYears);
        
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
    
}
