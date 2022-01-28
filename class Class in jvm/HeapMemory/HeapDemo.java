class HeapDemo{
	public static void main(String[] args){
	//Heap memory : run time object where stores also static variable
		double mb = 1024*1024;//beause output is in byte
		Runtime r = Runtime.getRuntime();
		System.out.println("Max Memory:"+r.maxMemory()/mb);
		System.out.println("Total Memory:"+r.totalMemory()/mb);
		System.out.println("Free Memory:"+r.freeMemory()/mb);
		System.out.println("Consumed Memory:"+(r.totalMemory()/mb-r.freeMemory()/mb));
	}
}