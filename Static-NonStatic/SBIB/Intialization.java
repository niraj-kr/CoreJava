public class Intialization{
	private static String m1(String msg){
		System.out.println(msg);
		return msg;
	}
	public Intialization(){
		m=m1("1");
	}
	{
		m=m1("2");
	}
	String m = m1("3");
	public static void main(String[] args){
		Object o = new Intialization();
	}
}