class Example{
	static int a = 10;
	static int b = 20;
	
	static{
		System.out.println("static block");
	}
	public static void main(String[] args){
		System.out.println("Main Method");
	}
	static void m1(){
		System.out.println("static method");
	}
}