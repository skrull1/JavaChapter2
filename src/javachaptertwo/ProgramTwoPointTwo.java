import java.text.DecimalFormat;
import java.util.Scanner;


public class ProgramTwoPointTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
                // Create Decimal Format Object
                DecimalFormat df = new DecimalFormat("#.####");
                
                // Create Second Decimal Format Object
                DecimalFormat df2 = new DecimalFormat("#.#");
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt for input
		System.out.print("Enter the radius and length of a cylinder: ");
		
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		// Calculate area and volume
		double area = Math.pow(radius, 2) * Math.PI;
		double volume = area * length;
		
		// Output results
		
                
                 System.out.println("The area is " + df.format(area));
		 System.out.println("The volume is " + df2.format(volume));
		
		//System.out.println("The radius is " + radius + " and the length is " + length);
		input.close();

	}

}
