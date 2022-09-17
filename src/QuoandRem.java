import java.util.Scanner;

/**
 * 
 */

/**
 * @author My self
 *
 */
public class QuoandRem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Qa and Rem");
		
		int Quo =input.nextInt();
		int Div =input.nextInt();
		
		int quotient = Quo/Div;
		int reminder = Quo%Div;
		
		System.out.println("quotient:"+ quotient);
		System.out.println("reminder:"+ reminder);
		

	}
}
