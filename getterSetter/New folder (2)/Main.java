class Room{
	private int l;
	private int b;
	
	int getL(){
		return l;
	}
	void setL(int l){
		this.l=l;
	}
	int getB(){
		return b;
	}
	void setB(int b){
		this.b=b;
	}
}
class Main{
	public static void main(String[] args){
		Room r = new Room();
		r.setL(5);
		r.setB(3);
		System.out.println(r.getL()*r.getB());
	}
}