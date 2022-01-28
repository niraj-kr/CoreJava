class Test{
	static int count = 0;
	public static void main(String[] args ){
			for(int i=0; i<10; i++){//put 100000000 or something(keep on increasing upto memory shortage problem ) so that gc will be called due to memory shortage
				Test t = new Test();
				t=null;
			}
	}
	public void finalize(){
		System.out.println("Finalize method called:"+ ++count);
	}
}



//objects which are not in use but also not available(eligible) for garbage collection such type of useless objects are called memory leaks
//in our program if memory leaks present then the program will be teminated by rising outofmemoryError Hence if the object is no longer required it is highly recommended to make that object eligible for gc.