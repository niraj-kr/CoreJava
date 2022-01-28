import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class College{
	public static void main(String[] args)throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter fno1: ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter fno2: ");
		int b = Integer.parseInt(br.readLine());
		
		int c = a+b;
		System.out.println("Result: "+c);
	}
}