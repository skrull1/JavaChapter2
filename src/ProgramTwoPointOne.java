import java.util.Scanner;


public class ProgramTwoPointOne {
	// Convert Celsius to Fahrenheit
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user
		System.out.print("Enter a degree in Celsius: ");
		int degreeInput = input.nextInt();
		double fahrenheit = (9 / 5.0) * degreeInput + 32;
		
		System.out.println(degreeInput + "  Celsius is " + fahrenheit + " Fahrenheit");
		input.close();

	}

}
