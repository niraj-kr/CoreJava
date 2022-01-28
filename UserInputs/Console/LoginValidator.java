import java.io.Console;

class LoginValidator{
	public static void main(String[] args){
		
		Console cns = System.console();
		
		System.out.println("Enter your username:");
		String username = cns.readLine();
		
		System.out.println("Enter your password:");
		char[] password = cns.readPassword();
		
		System.out.println("username:"+ username);
		System.out.println("password:"+ password);
	}
}