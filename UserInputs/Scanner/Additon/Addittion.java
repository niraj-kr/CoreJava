import java.util.*;

class Addition{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter FNo: ");
		int a = input.nextInt();
		//Naming came from ...
		// next : because cursor move to the next value stored in the scanner object (java Addition 10 20)
		//scanner : because of c point point of view (scanf)
		System.out.println("Enter SNo: ");
		int b = input.nextInt();
		
		int c = a + b;
		System.out.println("Result: "+ c);
	}
}