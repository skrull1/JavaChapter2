import java.text.DecimalFormat;
import java.util.Scanner;


public class ProgramTwoPointFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
                
                // Create Decimal Format object
                DecimalFormat df = new DecimalFormat("#.##");
		
		// Prompt user
		System.out.print("Enter a subtotal and a gratuity rate: ");
		
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble() / 100;	
		
		//System.out.println("The gratuity is " + (int)(subtotal * gratuity  * 100) / 100.0 + " and the total is " + (int)(subtotal * (1 + gratuity) * 100) / 100.0);
                System.out.println("The gratuity is " + df.format(subtotal * gratuity) + " and the total is " + df.format(subtotal * (1 + gratuity)));
		input.close();
	}

}
