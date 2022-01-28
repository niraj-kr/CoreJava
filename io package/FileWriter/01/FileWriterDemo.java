import java.io.*;
class FileWriterDemo{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("abc.txt");//if this file is not there then it will create a new one
		fw.write(100);//adding a single character
		fw.write("trigger\nparkouuuur");
		fw.write('\n');
		char[] ch1 = {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.flush();//for making  sure that write method empty
		fw.close(); 
	}
}