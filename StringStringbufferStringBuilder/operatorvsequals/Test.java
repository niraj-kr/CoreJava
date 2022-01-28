/*
	== operator vs equals() method :
	===============================
*/
class Test{
	public static void main(String[] args){
		
					String s1 = new String("durga");									
					String s2 = new String("durga");									
					System.out.println(s1==s2);//false														
					System.out.println(s1.equals(s2));//true becase in string class .equals method is overriden							

					StringBuffer sb1 = new StringBuffer("durga");
					StringBuffer sb2 = new StringBuffer("durga");
					System.out.println(sb1==sb2);//false
					System.out.println(sb1.equals(sb2));//false	
												
		/*
					>Both method are used for referenced camparison.
					In the case of string .equals() method is overriden thats why it compares content of both objects
					but in case of StringBuffer .equals method is not overriden thats why it compares refernces.
		*/
	}
}