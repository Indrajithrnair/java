import java.util.Scanner;

public class LargestThree
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");

		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");

		int num2 = sc.nextInt();
		
		System.out.println("Enter Third Number: ");

		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1 + "is the largest");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println(num2 + "is the largest");
		}
		else
		{
			System.out.println(num3 + "is the largest");
		}
	}
}