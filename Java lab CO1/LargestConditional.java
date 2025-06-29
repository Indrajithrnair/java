import java.util.Scanner;

public class LargestConditional
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");

		int a = sc.nextInt();	

		System.out.println("Enter Second Number: ");

		int b = sc.nextInt();
		
		System.out.println("Enter Third Number: ");

		int c = sc.nextInt();

		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println("Largest Number is " + max);		 
	}
		
}