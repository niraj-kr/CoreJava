import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.Console;

class Employee{
	public static void main(String[] args)throws IOException{
		Console cns = System.console();
		System.out.println("Enter username: ");
		String username = cns.readLine();
		
		System.out.println("Enter password: ");
		String password = cns.readPassword();
		
		if(username.equalsIgnoreCase("niraj")&&password.equals("Nit")){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			
			int eno = Integer.parseInt(args[0]);
			String ename = args[1];
			
			System.out.println("Enter salary: ");
			double sal = Double.parseDouble(br.readLine());
			System.out.println("Enter department: ");
			String dept = br.readLine();
			
			System.out.println("Enter mobile number:");
			long mobile = sc.nextLong();
			System.out.println("Enter e-mail:");
			String email = sc.next();
			
			char gender = System.getProperty("gender").charAt(0);
			boolean workingStatus = Boolean.parseBoolean(System.getProperty("status"));
			
			System.out.println("\nemp values");
			System.out.println("eno\t\t"+eno);
			System.out.println("ename\t\t"+ename);
			System.out.println("sal\t\t"+sal);
			System.out.println("dept\t\t"+dept);
			System.out.println("mobile\t\t"+mobile);
			System.out.println("email\t\t"+email);
			System.out.println("gender\t\t"+gender);
			System.out.println("workingStatus\t\t"+workingStatus);
			

			}else{
				System.out.println("Give username and password are incorrect");
			}
			//steps to run the command
			//javac Employee.java
			//java -Dgender=M -Dstatus=true Employee 72279 niraj
	}
}