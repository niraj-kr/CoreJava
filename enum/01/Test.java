// ->Every enum is internally implemented by using class concept
// ->Every enum constant is always public static final
// ->Every enum constant represent and object of the type enum.

// enum Beer{
// 	KF,RC;
// }
// 	|
// 	|
// 	V
	
// class Beer{
// 	public static final Beer KF = new Beer();
// 	public static final Beer RC = new Beer();
// }

// Enum declaration and usage 

// Every enum constant is always public static final and hence we can access enum constants by using enum name

enum Beer{
	KF,KO,RC,RO;//semi-colon is optional
}
class Test{
	public static void main(String[] args){
		Beer b = Beer.RC;
		System.out.println(b);
	}
}
	//Inside enum toString() method is internally implemented to return name of the constant.
	//we can declare enum either within the class or outside the class but not inside a method . if we are trying to declare inside a method then we will get compil time error saying enum types must not be local.
	/*
	enum x{}
	class y{}
	this is valid
	
	===============
	class x{
		enum y{}
	}
	this is valid
	==================
	
	class x{
		public void m1(){
			enum y{}
		}
	}
	this is not valid
*/

//if we declare enum outside of the class the applicable modifiers are public , default, strictfp.
//if we declare enum inside a class the applicable modifiers are public,<default>,strictfp, + private protected and static.