import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class College{
	public static void main(String[] args)throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Student s1 = new Student();
		System.out.println("student reference is created after storing given values");
		System.out.println("Enter student values");
		
		System.out.println("Enter sno\t\t");
		s1.sno = Integer.parseInt(br.readLine());
		
		System.out.println("Enter sname\t\t");
		s1.sname = (br.readLine());
		
		System.out.println("Enter Enter course\t\t");
		s1.course = br.readLine();
		
		System.out.println("Enter Enter fee\t\t");
		s1.fee = Double.parseDouble(br.readLine());
		
		System.out.println("Enter Enter email\t\t");
		s1.email = br.readLine();
		
		System.out.println("Enter Mobile\t\t");
		s1.mobile = Long.parseLong(br.readLine());
		
		System.out.println("Enter courseCompleted\t\t");
		s1.courseCompleted = Boolean.parseBoolean(br.readLine());
		
		System.out.println("Values are stored in student instance\n");
		
		System.out.println("sno\t\t\t"+ s1.sno);
		System.out.println("sname\t\t\t"+ s1.sname);
		System.out.println("course\t\t\t"+ s1.course);
		System.out.println("fee\t\t\t"+ s1.fee);
		System.out.println("email\t\t\t"+ s1.email);
		System.out.println("mobile\t\t\t"+ s1.mobile);
		System.out.println("courseCompleted\t\t\t"+ s1.courseCompleted);
		

	}
}