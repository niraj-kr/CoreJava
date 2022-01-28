//In all wrapper classes or collection classes ,string class, StringBuffer and StringBuilder classes toString method 
//	is overriden for meaningful String representation hence it is highly recommended to override toString method in our class also.
import java.util.*;
class Test {
	public String toString(){
		return "test";
	}
	public static void main(String[] args){
		String s = new String("trigger");
		System.out.println(s);
		Integer I = new Integer(10);
		System.out.println(I);
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		System.out.println(l);
		Test t = new Test();
		System.out.println(t);
	}
}