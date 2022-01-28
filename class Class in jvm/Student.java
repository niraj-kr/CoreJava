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
		int count=0;
		Class c = Class.forName("Student");
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m){
			count++;
			System.out.println(m1.getName());
		}
		System.out.println(count);
	}
}