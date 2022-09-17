import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
			int heads = 0,tails = 0;
			double head,tail;
			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter no of flip coin ");
			int a = Sc.nextInt();
			System.out.println(a);
			for(int i=0;i<a;i++) {
			double random = Math.random();
			
			if(random < 0.5) {
				System.out.println("TAIL");
				tails++;
				System.out.println("after "+tails);
			}
			else
			{
				System.out.println("HEAD");
				heads++;
				System.out.println("after "+heads);
			}
			}
			head = heads/(double)a*100;
			tail = tails/(double)a*100; 
			System.out.println("Percentage of head"+head);
			System.out.println("Percentage of tail"+tail);
			

	}

}
