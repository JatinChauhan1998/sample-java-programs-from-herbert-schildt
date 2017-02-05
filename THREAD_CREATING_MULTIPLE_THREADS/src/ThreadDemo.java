
public class ThreadDemo {

	public static void main(String[] args) {
		
		new CreateThread("First");//Creating a new Thread
		new CreateThread("Second");//Creating another new thread
		new CreateThread("Third");//Create another new thread
		
		try{
				Thread.sleep(10000);//Main Thread
		   }catch(InterruptedException ob){
		System.out.println("Exception MainClass Interrupted: "+ob);
		}
		
		System.out.println("Main Thread Exiting");
}}		
	

