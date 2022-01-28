//How static block execution flows
//01: Identification of static memebers form parent to child [i.e, in this case 1 to 11]
//02: Execution of static variable assignments and static block from parent to child [12 to 22]
//03: Execution of only current class main method that u are executing [means which class file u are running in this we are running derived class i.e, child class]

//NOTE: whenever we are loading child class automatically parent class will be loaded but whenever we are loading parent class child class won't be loaded[becasue parent class members by default availbale to the child class whereas child class members by default won't available to the parent.]
//when Derived class is executed
//no. from 1-25 for execution flow
class Base{
	//1-12
	static int i = 10;
	//2-13
	static{
		m1();//14
		System.out.println("Base static block");//15
	}
	//3
	public static void main(String[] args){
		m1();
		System.out.println("Base main");
	}
	//4
	public static void m1(){
		System.out.println(j);//14
	}
	//5
	static int j = 20;//16
}

class Derived extends Base{
	//6
	static int x = 100;//17
	//7
	static{
		m2();//18
		System.out.println("Derived first static block");//20
	}
	//8
	public static void main(String[] args){
		m2();//23
		System.out.println("Derived main");//25
	}
	//9
	public static void m2(){
		System.out.println(y);//19-24
	}
	//10
	static{
		System.out.println("Derived second static block");//21
	}
	//11
	static int y = 200;//22
}