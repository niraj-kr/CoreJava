class P{
	P() throws IOException{
		
	}
}

class C extends P{
	C() throws IOException/Exception/Throwable{
		super();
	}
}

//try catch is not allowed because in constructor first statement should be super

//If parent class constructor throws any checked exception compulsory child class constructor should throw same checked exception or its parent other wise the code won't compile.