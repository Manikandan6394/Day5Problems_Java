import java.util.Scanner;

/**
 * 
 */

/**
 * @author My self
 *
 */
public class Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter to check the vowels");
		char c=Sc.next().charAt(0);
		switch (c)
		{
		 case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
             System.out.println(c + " is vowel");
             break;
         default:
             System.out.println(c + " is consonant");
     }
		}
		

	}
