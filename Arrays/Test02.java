class Test02{
	public static void main(String[] args){
	//array variable declaration
		String[] arr;
	//array object creation
		arr = new String[5];
	//reading and displaying values from array(default values of array)
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		
		//initializing array object
		arr[0]="Niraj";
		arr[1]="ash";
		arr[2]="amalagam";
		arr[3]="camilla";
		arr[4]="steezy";
		
		//printing out the values of array
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println();
		
		 System.out.println(java.util.Arrays.toString(arr));
		 //initializing array directly in the same line if we know the exact values of array that we are initializing
		 String[] arr2 = {"ashely","ishiah","georgia","ariana"};
		 System.out.println(java.util.Arrays.toString(arr2));
		
	}
}