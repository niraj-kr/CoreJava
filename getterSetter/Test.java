class Student{
	int sno;
	String sname;
	//getters and setters first program
	void setSno(int sno){
		this.sno = sno;
	}
	int getSno(){
		return this.sno;
	}
	void setSname(String sname){
		this.sname = sname;
	}
	String getSname(){
		return this.sname;
	}
	void display(){
		System.out.println(sno+"...."+sname);
	}
	
}
class Test{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setSno(101);
		s1.setSname("trigger");
		System.out.println(s1.getSno());
		System.out.println(s1.getSname());
	}
}