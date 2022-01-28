//variable in A and B (class level) : variable hiding 
//but within the same class the class level variable and method level are comes under variable shadowing
class A{
	int x = 10;
}
class B extends A{
	int x = 20;
	
	void m1(){
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
class Main{
	public static void main(String[] args){
		B obj = new B();
		obj.m1();
	}
}