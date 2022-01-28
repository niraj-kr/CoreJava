class Example{
	static Example e1 = new Example();
	static{
		System.out.println("SB");
	}
	{
		System.out.println("NSB");
	}
	Example(){
		System.out.println("constructor");
	}
	public static void main(String[] args){
		System.out.println("main");
		Example e2 = new Example();
	}
	static int a = 10;
	int x = 20;
}