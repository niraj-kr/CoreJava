//Enum vs Switch

//Until 1.4 version the allowed argument types for the switch statement are :-
// byte,short,char, int
//but from 1.5 version onwards corresponding wrapper classes and enum types are allowed
//from 1.7 version onwards String type also allowed
/*
	|--------------------------|
	|1.4v	|	1.5v	| 1.7v |
	|--------------------------|
	|byte	|Byte		|	   |
	|short	|Short		|	   |
	|char	|Character	|String|
	|int	|Integer	|	   |
	|		|enum		|	   |
	|--------------------------|
	*/
	
enum Beer{
	KF,KO,RC,RO;
}
class Test{
	public static void main(String[] args){
		Beer b = Beer.KF;
		switch(b){
			case KF:System.out.println("It is children's brand");
				break;
			case KO:System.out.println("It is too light");
				break;
			case RC:System.out.println("It is not that much kick");
				break;
			case RO:System.out.println("By one get one free");
				break;
			default:System.out.println("other brand are not recommended");
		}
	}
}
	//if we pass enum type as argument to switch statement then every case label should be 
	//valid enum constant other wise we will get compile time error.
	/*
	switch(b){
	case KR:
	case KO:
	case RC:
	case FO:
	case KALYANI;//this is not allowed becasue it is not a constant in enum
	}
	*/