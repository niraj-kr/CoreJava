//calling inner class method from a instance method inside outer class 

class Outer{
	class Inner{
		public void m1(){
			System.out.println("Inner class method");
		}
	}
	public void m2(){
		Inner i = new Inner();
		i.m1();
	}
	public static void main(String[] args){
		Outer o = new Outer();
		o.m2();
	}
}