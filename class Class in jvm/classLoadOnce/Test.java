import java.lang.reflect.*;
class Student{
	public String getName(){
		return null;
	}
	public int getMarks(){
		return 10;
	}
}
class Test{
	public static void main(String[] args)throws Exception{
		Student s1 = new Student();
		Class c1 = s1.getClass();
		Student s2 = new Student();
		Class c2 = s2.getClass();
		//class loaded once only even after second object creation they are pointing to the same object
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1==c2);
	}
}