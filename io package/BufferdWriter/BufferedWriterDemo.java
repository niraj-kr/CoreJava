import java.io.*;
class BufferedWriterDemo{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch1 = {'a','b','c','d'};
		bw.write(ch1);
		bw.newLine();
		bw.write("trigger");
		bw.newLine();
		bw.write("storror army");
		bw.flush();
		bw.close();
		//whenever we are closing bufferdwriter automatically internal filewriter will be closed and we are not required to close explicitlys
	}
}