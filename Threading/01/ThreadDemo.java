class MyThread extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("child thread");
		}
	}
}

class ThreadDemo{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();// replace with t.run()
		
		for(int i=0; i<10; i++){
			System.out.println("main Thread");
		}
	}
}
//thread scheduler : it is the part of jvm . it is responsible to schedule threads i.e, if multiple threads are waiting to get the chance of execution then in which order threads will be executed is decided by thread scheduler.
//we can't expect exact algorithm followed by thread scheduler it is varied from jvm to jvm . Hence we can't expect thread execution order and exact output.
//Hence whenever situationn comes to multithreading there is no guarantee for exact output but we can provide several possible outputs.

//case 2 : Difference between t.start() aand t.run()
//		IN the case of t.start() a new thread will be created  which is responsible for the execution of run() method but 
//    In the case t.run() a new thread won't be created and run() method will be executed just like a normal method call by main thread
//  Hence in the above program if replace t.start() with t.run() then the output is child thread ...10 times followed by main thread ...10 times this total output produced by only main thread 