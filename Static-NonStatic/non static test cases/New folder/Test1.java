class Example{
	int x=10;
	
	void m1(){
		Example e1 = new Example();
		System.out.println(e1.x);
	}
	void m2(){
		System.out.println(x);
	}
}
class Test1{
	public static void main(String[] args){
		Example e1 = new Example();
		e1.x = 15;
		e1.m1();
		e1.m2();
		Example e2 = new Example();
		e2.x = 18;
		e2.m1();
		e2.m2();
	}
}