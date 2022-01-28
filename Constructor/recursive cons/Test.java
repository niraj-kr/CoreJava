class Test{
	Test(){
		this(10);
	}
	Test(int i){
		this();
	}
	//IN oour program if there is chance recursive constructor invocation then the code won't compile and we will get compile time error.
	//compile time error recursive constructor invocation.
	public static void main(String[] args){
		System.out.println("hola!!");
	}
}