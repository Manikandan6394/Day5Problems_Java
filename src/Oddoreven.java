import java.util.Scanner;

/**
 * 
 */

/**
 * @author My self
 *
 */
public class Oddoreven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number to check odd or even");
		int a=Sc.nextInt();
		if(a%2!=0) {
			System.out.println("Number is odd");
			
		}else
			System.out.println("Number is even");

	}

}