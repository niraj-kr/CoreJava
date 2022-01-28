//Java 7v new feature2 with respect to Exception handling

class CatchWithMultipleException{
	public static void main(String[] args){
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("Result: "+c);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
			System.out.println("please enter only integers, two integers");
		}catch(ArithmeticException e){
			System.out.println("Dont pass second value as Zero");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}