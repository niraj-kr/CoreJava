class Test4{
	public static void main(String[] args){
	//array variable declaration
		String[] s1;
		//array object creation
		s1 = new String[5];
		//reading and displaying values of array
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		System.out.println(s1[3]);
		System.out.println(s1[4]);
		
		//initializing array object
		s1[0]="trigger";
		s1[1]="kninja";
		s1[2]="loci";
		s1[3]="panther";
		s1[4]="obama";
		//displaying values of array 
		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i]);
		}
		System.out.println();
		s1[1]=s1[1].toUpperCase();
		s1[2]=s1[2].toLowerCase();
		s1[3]=s1[3].concat("-"+s1[4]);
		
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		System.out.println(s1[3]);
	}
}