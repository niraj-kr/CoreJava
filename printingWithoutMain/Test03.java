//works until javaa 1.6 version. newer versions don't allow because JVM checks the presence of the main method before intializing the class.

class Test03{
	static int i = m1();
	static int m1(){
		System.out.println("heheehee!!!");
		System.exit(0);
		return 10;
		}
}