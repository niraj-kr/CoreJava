//works until javaa 1.6 version. newer versions don't allow because JVM checks the presence of the main method before intializing the class.

class Test01{
	static Test01 t = new Test01();
	{
		System.out.println("ayeeeee!!!");
		System.exit(0);
	}
}