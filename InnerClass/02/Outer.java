//Inner class : How to call Inner class method from outer class main method.
//step 1 : create outer class object cuz without existing outer class object u can't call a Inner class method.
//step 2 : now after that using the reference of outer class create an object of inner class as written below (line:14)
//step 2 : and with that reference that u have create right after outer class call the method .

class Outer{
	class Inner{
		public void m1(){
			System.out.println("Inner class method");
		}
	}
	public static void main(String[] args){
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}