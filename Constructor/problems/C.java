class P{
	p(int i){
		//super();
	}
}
class C extends P{
	//c(){
	//	super();
	//}
}//CE: cannot find symbol : constructor p() location : class p

note : 
1. if parent class contains any argument constructor then while writing child classes we have to take special care with respect to constructors 
2.*** whenever we are writing any argument constructor it is highly recommended to write no args constructor also