
public class Callme {
	void call(String msg){
		
		//adding synchronized keyword prevents other
		//threads from entering the call() while
		//another thread  is using it
		
		//i.e synchronized void call(String msg)
		
		//other way to achieve synchronization is
		//to use a synchronized block (Explained in Caller Class) 
		
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ep){
			System.out.println("Exception"+ep);
		}
		System.out.println("]");
	}
}
