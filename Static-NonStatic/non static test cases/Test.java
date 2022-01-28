class Test{
	int x=10;
	int y = 20;
	
	void setXYz(){
		x=50;
		y=60;
	}
	void printXYZ(){
		System.out.println(x);
		System.out.println(y);
	}
	void m1(){
		setXYz();
		printXYZ();
	}
	public static void main(String[] args){
		Test t1 = new Test();
		t1.m1();
		//same object reference is being used for accessing x and y values.
		// 50 and 60 is stored in the object reference
		// depend on the object if the same x and y we are accesing directly  from another object we get 10 and 20
		// this keyword is being passed throughtout the different methods which being called during during accesing x and y which object reference.
	}
}