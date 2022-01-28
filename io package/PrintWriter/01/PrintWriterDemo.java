import java.io.*;
class PrintWriterDemo{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("abc.txt");
		PrintWriter out = new PrintWriter(fw);
		out.write(100);
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("durga");
		out.flush();
		out.close();
	}
}

//what is the difference between write(100) and print(100)
//In the case write(100) the corresponding character D will be added to the file
// but in the case print(100) the int value 100 will added to the file directly.
//Note : the most enhanced writer to write character data to the file is printwriter
//whereas the most enhanced reader to read character data from the file is BufferedReader.

//Note : In general we can use Readers and writers to handle character data(text data), whereas we can Streams to handle binary data(like images,pdf,video...e.t.c.)
// we can use OutPutStream to write binary data to the file
//INputSteam to read binary data from the file
/*
									      Object
									   /             \
									  /               \
									 /        		   \
									/          			\
								Writer(AC)				Reader(AC)
				
OutputStreamWriter |	BufferedWriter |	PrintWriter	 |||	InputStreamReader |	BufferedReader									 
		|														|
		|														|
	FileWriter												FileReader	
									   */