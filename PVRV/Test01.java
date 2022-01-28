class Example{
	int x= 10;
	int y= 20;
}
class Test{
	public static void main(String[] args){
	//DT-->datatype, RV-->Reference variable , PV-->Primitive variable 
		//DT vname = value/object
		//DT PDT/RDT
		
		//PV creation
		int i1 = 10;
		
		//RV creation array type
		int[] ia1 = {3,4,6};
		
		//RV creation class type
		Example e = new Example();
		
		//using PV in calculation
		int a = 10;
		int b = 20;
		int c = a+b;
		
		//Using RV in calculation
		Example e1 = new Example();
		Example e2 = new Example();
		//Example e3 =e1+e1;
		
		System.out.println(i1);
		System.out.println(ia1);
		System.out.println(e1);
	}
}