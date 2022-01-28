import java.util.Scanner;

public class College{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.println("Enter your name:");
		s1.name = sc.nextLine();
		
		System.out.println("Enter your roll no");
		s1.roll = sc.nextInt();
		
		System.out.println("Enter your ph no.");
		s1.ph = sc.nextLine();
	}
}