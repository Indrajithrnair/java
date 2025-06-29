import java.util.Scanner;

public class fahrenheit_to_celsius_conversion
{

	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("Fahrenheit to Celsius Conversion");

			System.out.println("--------------------------------");

			System.out.println("\nEnter temperature in farenheight: ");

			float fahrenheit = sc.nextFloat();

			float celcius = (fahrenheit - 32) * 5 / 9;

			System.out.println("\nTemperature in Celcius = " + celcius);

		}

}