
public class Main {
	public static void main(String[] args){
		Apple ap;
		System.out.println("Price of all the Apple:");
		for(Apple p:Apple.values())
			System.out.println(p+" = "+ p.getPrice());
		
	}

}
