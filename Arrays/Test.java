class Test{
	public static void main(String[] args){
	//array variable declaration
		int[] arr;
	//array object creation
		arr = new int[5];
	//reading and displaying values from array(default values of array)
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		
		//initializing array object
		arr[0]=3;
		arr[1]=4;
		arr[2]=6;
		arr[3]=9;
		arr[4]=2;
		
		//printing out the values of array
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println();
		//modify array values
		arr[1]=9;
		arr[4]=1;
		
		//Displaying array modified values
		//toString is used for displaying array elements as string
		System.out.println(java.util.Arrays.toString(arr));
		
	}
}