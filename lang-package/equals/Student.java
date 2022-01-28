/*
	equals() :
		We can use equals() to check equality of two objects.
		eg. obj1.equals(obj2)
		If our class doesn't contain equals() then object class equals method will be executed.
		 
*/
class Student{
	String name;
	int rollno;
	Student(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args){
		Student s1 = new Student("Durga",101);
		Student s2 = new Student("Ravi",102);
		Student s3 = new Student("Durga",101);
		Student s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
//in the above example object class equals method got executed which is meant for reference comparasion(address comparasion) i.e, if two references pointing to the same object then only .equals method returns true.
//Based on our requirement we can override equals method for content comparasion
//While overriding equals method for content comparasion we have to take care about the following :-
	//1. what is the meaning of equality ie,(better we have to check only names or only rollno or both)
	//2. If we are passing different types of object our equals method should rise classCastException ie, we have handle CastCastException to return fasle.
	//3. we are passing null argument then our equals method should not rise nullPointerException ie, we have to handle nullPointer Execption to return false.
//The following is the proper way of overriding equals method for student class content comparasion.	
 
 	/*
		public boolean equals (Object obj){
			try{
				String name1 = this.name;
				int rollno1 = this.rollno;
				Student s = (Student)obj;
				String name2 = s.name;
				int rollno2 = s.rollno;
				if(name1.equals(name2) && rollno1 == rollno2){
					return true;
				}else{
					return false;
				}
			}
			catch(ClassCastException e){return ture;}
			catch(NullPointerException e){return false;}
		}
	*/
	/*  More simplified version of equals() method
		public boolean equals(Object obj){
			if(obj instanceof Student){
				Student s = (Student)obj;
				if(name.equals(s.name) && rollno == s.rollno){
					return true;
				}else{
					return false;
				}
			}
			return false;
		}
	*/
	//to make above equals method more efficient we have to write the following code at the beginning inside equals method
	/*
		public boolean equals(Object obj){
			if(obj == this)
				return true;
			if(obj instanceof Student){
				Student s = (Student)obj;
				if(name.equals(s.name) && rollno == s.rollno){
					return true;
				}else{
					return false;
				}
			}
			return false;
		}
		//according to this if both references pointing to the same object then without performing any comparasion .equals() returns true direclty.
	*/
	
	/*
		Student s1 = new Student("durga",100);
		Student s2 = new Student("ravi",101);
		Student s3 = new Student("durga",100);
		Student s4 = s1;
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//true
		System.out.println(s1.equals("durga"));//false
		System.out.println(s1.equals(null));//false
	*/
	
	/*
		String s1 = new String("durga");		|	StringBuffer sb1 = new StringBuffer("durga");
		String s2 = new String("durga");		|	StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(s1==s2);//false		|	System.out.println(sb1==sb2);//false
		System.out.println(s1.equals(s2));		|	System.out.println(sb1.equals(sb2));
		//In String class .equals() method is overriden for content comparasion hence, even though objects are different if content is same then .equals() return true
		
		//In StringBuffer .equals() method is not overriden for content comparasion Hence, if objects are different equals() return false even though content is same.
	*/
	