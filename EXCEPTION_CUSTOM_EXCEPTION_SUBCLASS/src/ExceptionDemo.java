public class ExceptionDemo {
	static void compute(int a) throws MyCustomException{
		System.out.println("Called Compute: "+a);
		if(a>10)
			throw new MyCustomException(a);
		System.out.println("Normal Exit!");
	}
	
	public static void main(String[] args){
		
		try {
			compute(1);
			compute(20);
			compute(2);//won't execute
			compute(5);//won't execute
			compute(22);//won't execute
		} catch (MyCustomException excep) {
			System.out.println(excep);
			//excep.printStackTrace();
		}
		
	}
	
}