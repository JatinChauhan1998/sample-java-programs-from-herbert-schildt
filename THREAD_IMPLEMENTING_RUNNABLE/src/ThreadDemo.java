
public class ThreadDemo {

	public static void main(String[] args) {
		
		new FirstThread();//Creating a new Thread
		new SecondThread();//Creating another new thread
		
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException ob){
			System.out.println("Exception MainClass Interrupted: "+ob);
		}
		
		System.out.println("Main Thread Exiting");
				
	}
	
}
