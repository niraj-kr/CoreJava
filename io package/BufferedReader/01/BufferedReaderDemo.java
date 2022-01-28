import java.io.*;
class BufferedReaderDemo{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null){
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}
//Note: whenever we are closing buffered reader automatically underlying filereader will be closed and we are not required to close explicitly 
////the most enhanced reader to read character data from the file is bufferedReader