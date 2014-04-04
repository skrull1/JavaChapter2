import java.text.DecimalFormat;
import java.util.Scanner;


public class ProgramTwoPointThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
                
                // Create Decimal Format Object
                DecimalFormat df = new DecimalFormat("#.##");
		
		// Prompt user
		System.out.print("Enter a value for feet: ");
		int feetEntered = input.nextInt();
		
		double meterCalculate = feetEntered * .305;
		
		System.out.println(feetEntered + " feet is " + df.format(meterCalculate) + " meters");
		input.close();

	}

}
