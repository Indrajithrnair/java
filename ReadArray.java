//Read and Print Array Elements – Input n elements, store in array, and display.
import java.util.Scanner;

class ReadArray{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of array: ");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Size: " + size);

		for(int i = 0; i < size; ++i){
			arr[i] = i; 

		}

		System.out.println("Array val: ");

		for(int i = 0; i < size; ++i){
			System.out.println(arr[i]);

		}
	}

}
