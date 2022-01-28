class Example{
	int x = m1();
	int m1(){
		System.out.println("m1.x");
		return 10;
	}
	{
		System.out.println("NSB1");
	}
	Example(){
		System.out.println("NPC");
	}
	Example(String s){
		System.out.println("SPC");
	}
	int y = 30;
	{
		System.out.println("NSB2");
	}
	int z = 40;
	public static void main(String[] args){
		Example e1 = new Example();
	}
}