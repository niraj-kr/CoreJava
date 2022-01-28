//if our class doesn't contain toString method then object class toString method will be executed.
class Student{
	 String name;
	 int rollno;
	 Student(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	 }
	 public static void main(String[] args){
		Student s1 =  new Student("trigger",101);
		Student s2 = new Student("niraj",102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	 }
}
//In the above example object class toString method got executed which is implemented as follows
/*
	public String toString(){
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	
	//i.e, classname@hashCode-in-hexadecimal-form
	//based on our requirement we can override toString method to provide our own string representation.
	for e.g. Whenever we are trying to print stuendt object reference to print his name and rollno we have
	to override toString method as follows :
	
	public String toString(){
		return name + "...." + rollno;
		//return "This is stuendt with the name :" + name+ " and rollno "+ rollno;
	}
	
*/