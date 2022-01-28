//Instance control flow in parent to child relationship
//01: Identification fo instance members from parent to child
//02: Execution of instance variable assignments and instance blocks only in parent class
//03: Execution of parent constructor

//04: Executionof instance variable assignments and instance block in child class
//05: Execution of child constructor
class Parent{
	int i = 10;
	{
		m1();
		System.out.println("Parent instance block");
	}
	Parent(){
		System.out.println("parent Constructor");
	}
	public static void main(String[] args){
		Parent p = new Parent();
		System.out.println("Parent main");
	}
	public void m1(){
		System.out.println(j);
	}
	int j = 20;
}

class Child extends Parent{
	int x = 100;
	{
		m2();
		System.out.println("child first instance block");
	}
	Child(){
		System.out.println("child constructor");
	}
	public static void main(String[] args){
		Child c = new Child();
		System.out.println("child main");
	}
	public void m2(){
		System.out.println(y);
	}
	int y = 200;
}