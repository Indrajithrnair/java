import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Series{

	static int recursionCount = 0;

	public int generateSeries(int num){
		
		recursionCount++;
	
		if(num == 0){

			return 0;

		}

		else if(num == 1){
		
			return 1;				

		}

		else{
			return generateSeries(num - 1) + generateSeries(num - 2);	
	
		}
		
}

}

public class FibonacciSeries{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Series s1 = new Series();
		
		System.out.println("Enter the limit: ");
		
		int limit = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < limit; ++i){

			System.out.print(s1.generateSeries(i) + " ");
		
		}

		System.out.println("Number of times the funtion was called: " + s1.recursionCount);
		
}

}