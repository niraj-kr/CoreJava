class Example{
	static void m1(){
		System.out.println("m1");
	}
	static int m2(){
		System.out.println("m2");
		return 5;
	}
}
class Test06_VoidNV{
	public static void main(String[] args){
		Example.m1();
		//int x =Example.m1();
		//int y = Example.m1()+20;
		//m2(Example.m1());
		//System.out.println(Example.m1());
		System.out.println();
		
		Example.m2();
		int x = Example.m2();
		m2(Example.m2());
	}
	static void m2(int x){
		
	}
	static void m3(){
		//return Example.m1();
	}
}