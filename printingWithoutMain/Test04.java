//works until javaa 1.6 version. newer versions don't allow because JVM checks the presence of the main method before intializing the class.

class Test04{
	static{
		System.out.println("hmmmmmm!!!!");
		System.exit(0);
	}
}