class Addition{
	public static void main(String[] args){
		String fno = System.getProperty("fno");
		String sno = System.getProperty("sno");
		
		int a = Integer.parseInt(fno);
		int b = Integer.parseInt(sno);
		
		int c = a+b;
		
		
		System.out.println(c);
	}
}
//system properties approach is a bad approach for reading runtime values from end-user
//System properties approach is only good approach when programmer needs to pass some JVM level configuration values or project level common values
//when applets concept was there is projects this system properties approch we were using
//now a days system prop. approach is not using from reading values from cmd line.
//but it is still using in projects from storing values from project using system.setProperty(-,-)approach.
//How to run this program
//javac Addition.javac
//java -Dfno=4 -Dsno Addition