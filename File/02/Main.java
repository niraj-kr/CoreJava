import java.io.FileWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
	try{
		FileWriter writer = new FileWriter("poem.txt");//if this doesn't exists then it generate a new one .
		writer.write("Roses are red \nViolets are blue\n Rockin everywhere");
		writer.append("\n(a poem by trigger)");//if you want to add more lines later
		writer.close();
	}catch(IOException e){
		e.printStackTrace();
	}
		
	}
}