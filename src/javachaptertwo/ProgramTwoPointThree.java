import java.util.Scanner;


public class ProgramTwoPointThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user
		System.out.print("Enter a value for feet: ");
		int feetEntered = input.nextInt();
		
		double meterCalculate = feetEntered * .305;
		
		System.out.println(feetEntered + " feet is " + meterCalculate + " meters");
		input.close();

	}

}
