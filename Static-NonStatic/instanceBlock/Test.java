// @DurgaSoft-62
//01: Identification of instance members from top to bottom
//02: Execution of instance variable assignment and instance block from top to bottom
//03: Execution of constructor.
//NOTE: static control flow is one time activity which will be performed at the time of class loading
//but instance control flow is not one time activity and it will be performed for every object creation.
//Object creation is most costly operation if there is no specific reqirement them it is not recommended to create object
class Test{
	int i =10;
	{
		m1();
		System.out.println("First instance block");
	}
	Test(){
		System.out.println("constructor");
	}
	public static void main(String[] args){
		Test t = new Test();
		System.out.println("main");
	}
	public void m1(){
		System.out.println(j);
	}
	{
		System.out.println("Second instance block");
	}
	int j = 20;
}