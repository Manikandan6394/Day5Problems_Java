import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		double seq =0;
		double i;
		double num2 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the seq");
		double a=input.nextDouble();
		for( i=1;i<=a;i++) {
			seq = seq+(1/i);
			num2 = seq;
		}
		System.out.println(num2);

	}
}