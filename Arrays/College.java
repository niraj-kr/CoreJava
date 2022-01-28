import java.util.Scanner;
class Student{
	int sno;
	String sname;
	String course;
	double fee;
}
 class College{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many applications do you want enter?");
		
		final int size = sc.nextInt();
		Student[] studentsArray = new Student[size];
		
		for(int i=0; i<size; i++){
			System.out.println("\nEnter student"+(i+1)+"values");
			//didn't understand why student is inside for loop
			Student student = new Student();
			
			System.out.print(" sno:\t\t");
			student.sno=sc.nextInt();sc.nextLine();
			
			System.out.print(" sname:\t\t");
			student.sname=sc.nextLine();
			
			System.out.print(" course:\t");
			student.course=sc.nextLine();
			
			System.out.print(" fee:\t\t");
			student.fee=sc.nextDouble();
			
			studentsArray[i]=student;
			System.out.println("Student "+(i+1)+" details are stored");
		}
		System.out.println("\nStduent details");
		
		for(int i=0;i<size;i++){
			Student student = studentsArray[i];
			System.out.println("Student("+student.sno+","+student.sname+","+student.course+","+student.fee+")");
		}
	}
}