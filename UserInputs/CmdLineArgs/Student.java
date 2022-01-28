class Student{
	
	
	public static void main(String[] args){
		Data s1 = new Data();
		 s1.sno = Integer.parseInt(args[0]);
		 s1.sname = args[1];
		 s1.course = args[2];
		 s1.fee = Double.parseDouble(args[3]);
		 s1.mobile = Long.parseLong(args[4]);
		 s1.email = args[5];
		 s1.courseCompleted = Boolean.parseBoolean(args[6]);
		 
		 System.out.println(s1.courseCompleted);
		 
	}
}