import java.util.Scanner;

/**
 * 
 */

/**
 * @author My self
 *
 */
public class Largestnum1amongThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double i;
		double value = 0;
		double num1 =0;
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the num1ber ");
		double a=Sc.nextDouble();
		
		for( i=1;i<=a;i++) {
			num1 = num1+(1/i);
			value = num1;
		}
		System.out.println(value);

	}
}
