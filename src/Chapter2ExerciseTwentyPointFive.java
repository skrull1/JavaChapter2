
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dagon
 */
public class Chapter2ExerciseTwentyPointFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        
        // Obtain the current second in the minute in the hour
        long currentSecond = (int)(totalSeconds % 60);
        
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        
        // Obtain the current minute in the hour
        long currentMinute = totalMinutes % 60;
        
        // Obtain the total hours
        long totalHours = totalMinutes / 60;
        
        // Compute the current hour
        long currentHour = totalHours % 24;
        
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Enter the time zone offset to GMT: ");
        int gmt = input.nextInt();
        
        
        
        
        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        System.out.println("The current time with GMT modified is " + (currentHour + gmt) + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
    
}
