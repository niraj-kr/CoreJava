class Test{
	public static void main(String[] args){
		System.out.println(String.class.getClassLoader());
		System.out.println(Test.class.getClassLoader());
		//System.out.println(Customer.class.getClassLoader());//for extension class loader
	}
}

//For String.class: Bootstrap Class Loader from Bootstrap classpath
//0/p: null --> because it is not written in java bootstrap is not a java object
//but extension and application class loader are java objects hence we are getting corresponding output for the remaining sop
//For Test.class: Application class loader from application classpath
//o/p: jdk.internal.loader.ClassLoaders$AppClassLoader@4e0e2f2a
//    [classname@hashcodee_in_hexadecimalform]