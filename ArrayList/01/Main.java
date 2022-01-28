import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("panipuri");
		food.add("dosa");
		
		//food.set(0,"chow");
		//food.remove(2);
		//food.clear();
		
		for(int i=0; i<food.size(); i++){
			System.out.println(food.get(i));
		}
	}
}