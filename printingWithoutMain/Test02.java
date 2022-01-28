//works until javaa 1.6 version. newer versions don't allow because JVM checks the presence of the main method before intializing the class.

class Test02{
	static Test02 t = new Test02();
	
	Test02(){
		System.out.println("awwwwweee!!");
		System.exit(0);
	}
	
}