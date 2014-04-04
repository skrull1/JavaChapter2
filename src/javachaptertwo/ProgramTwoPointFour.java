import java.util.Scanner;


public class ProgramTwoPointFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Scanner
				Scanner input = new Scanner(System.in);
				
				// Prompt user
				System.out.print("Enter a number in pounds: ");
				double poundsEntered = input.nextDouble();
				
				double kilogramCalculate = poundsEntered * .454;
				
				System.out.println(poundsEntered + " pounds is " + kilogramCalculate + " kilograms");
				input.close();

	}

}
