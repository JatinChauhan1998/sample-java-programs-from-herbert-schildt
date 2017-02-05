
public class MyCustomException extends Exception{
	private int type;
	MyCustomException(int a) {
		type=a;
	}	
	public String toString(){
		return "Exception bitches! @[ "+type+" ]";
	}
	
}
