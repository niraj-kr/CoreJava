class Example{
	static int a = m1();
	static int m1(){
		System.out.println("Ex SV");
		return 10;
	}
	static{
		System.out.println("EX SB");
	}
	static void m2(){
		System.out.println("Ex SM");
	}
	public static void main(String[] args){
		System.out.println("EX main");
	}
}