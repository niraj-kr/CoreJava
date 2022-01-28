/*
	Mutability vs Immutability :
	============================
*/

class Test{
	public static void main(String[] args){
	
	/*
		String is immutable .															
		so s is pointing to only durga.															
		and after using concat method it will create another object to store
		durgasoft.
	*/
		
		String s = new String("durga");
		s.concat("software");
		System.out.println(s);//durga
		
	/*
		String buffer is mutable . thats it can modify its object
		and here append method modifies the same object .
	*/
		StringBuffer sb = new StringBuffer("durga");
		sb.append("software");
		System.out.println(sb);//durgasoft
		
	}
}