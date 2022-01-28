class Test3{
	public static void main(String[] args){
		int[] ia1 = new int[5];
		int[] ia2 = {3,4,5,6,7};
		
		m1(ia1);
		m1(ia2);
		//directly passing array values in method without creatinn variable
		m1(new int[]{2,3,4});
		
		
	}
	
	static void m1(int[] ia){
		System.out.println(java.util.Arrays.toString(ia));
	}
}