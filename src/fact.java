import java.util.Scanner;

/**
 * 
 */

/**
 * @author My self
 *
 */
public class fact {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=Sc.nextInt();

		System.out.print("The Prime Factors of " + n + " are : ");
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+ "N");
			}
		}

	}
}