import java.io.*;
class FileWriterDemo{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("abc.txt",true);//if you want to append data 
		fw.write(100);//adding a single character
		fw.write("trigger\nparkouuuur");
		fw.write('\n');
		char[] ch1 = {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.flush();//for making  sure that write method empty
		fw.close(); 
		//the main problem with FileWriter is we have to insert line seperator \n manually which is varied from system
		//it is difficulty to the programmer, we can solve this problem with bufferedwriter and printwriter classes.
	}
}