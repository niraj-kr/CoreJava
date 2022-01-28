class Test{
	{
		System.out.println("First Instance block");
	}
	static{
		System.out.println("First static block");
	}
	Test(){
		System.out.println("Constructor");
	}
	public static void main(String[] args){
		Test t = new Test();
		System.out.println("main");
		Test y = new Test();
	}
	static{
		System.out.println("Second static block");
	}
	{
		System.out.println("Second instance block");
	}
}