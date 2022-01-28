import java.io.PrintStream;

class TryWithResource02{
	public static void main(String[] args){
		try(PrintStream ps = new PrintStream(System.out)){
			ps.println("hello pablo!");
		}
		System.out.println("after try-with-resource");//this is not going to print cuz try with resource always close its resources implicitly(i.e, here we have out object of printstream class)
	}
}