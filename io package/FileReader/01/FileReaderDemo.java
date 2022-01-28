import java.io.*;
class FileReaderDemo{
	public static void main(String[] args) throws IOException{
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		//approach 1
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		for(char ch1:ch){
			System.out.println(ch1);
		}
		System.out.println("************************");
		//approch 2
		FileReader fr1 = new FileReader("abc.txt");
		int i = fr1.read();
		while(i!=-1){
			System.out.println((char)i);
			i=fr1.read();
		}
	}
}
// by using FileReader we can read data charater by charactr which is not convinient to the programmer.
//usage of fileReader and fileWriter is not recommended because 
//->while writiiiing data by fileWriter we havee to insert line separator(\n) manually which is varied from system to system it is difficult to the programmer
//->while using fileReader wee can read data character by character , which is not convinient to the programmer.
//to overcome these problem wee should go for bufferedwriter and bufferedreader.