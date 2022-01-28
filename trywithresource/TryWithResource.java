//To display data on console by using PrintStream object

import java.io.Printstream;
class TryWithResource01{
	public static void main(String[] args){
		Printstream ps = null;
		//Upto Java 6
		/*try{
			ps=new PrintStream(System.out);
			ps.println(""Hi);
		}
		finally{
			if(ps!=null)
				ps.close();
		}*/
		//From java 7v onwards
		/*try(PrintStream ps = new PrintStream(System.out);){
			ps.println("HI");
		}*/
		
	}
}