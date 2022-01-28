import java.util.Scanner;
import java.util.InputMismatchException;

class Addition{
	static int add(int a, int b){
		if(a<0||b<0) throw new NegativeNumberException("Inputs should be only +ve values");
		return a + b;
	}
}
class NegativeNumberException extends Exception{
	NegativeNumberException(){
		super();
	}
	NegativeNumberException(String msg){
		super(msg)
	}
}
class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			try{
				System.out.println("Enter FNo.");
				int a = sc.nextInt();
				
				System.out.println("Enter SNo.");
				int b = sc.nextInt();
				
				int c = Addition.add(a,b);
				System.out.println("Result: "+c);
				
			}catch(InputMismatchException e){
				System.out.println("Please pass integer only");
				sc.nextLine();
			}catch(NegativeNumberException e){
				System.out.println(e.getMessage());
			}
		}
	}
}