
public class Main {
	
	static void trying() throws IllegalAccessException{
		System.out.println("Inside the trying method");
		throw new IllegalAccessException ("Jatin");
	}

	public static void main(String[] args) {
		try{
			trying();
		}catch (IllegalAccessException excep){
			System.out.println("Exception name "+excep );
		}
		

	}

}
