
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		
		System.out.println("Current Thread: "+t);
		//Output: Current Thread: Thread[main,5,main]
		//Thread[Thread Name, Priority, Name of its Group]
		
		t.setName("Jatin's new thread");
		
		System.out.println("setName Method: "+t);
		System.out.println("getName Method: "+t.getName());//Name of he Thread
		System.out.println("getName Method: "+t.getPriority());//Priority of the Thread
		System.out.println("getName Method: "+t.getThreadGroup());//Name of its Group
		
		//Current Thread: Thread[Jatin's new thread,5,main]
		//Thread[Thread Name, Priority, Name of its Group]
		
		try{
			for (int n=10;n>0;n--){
				System.out.println("Number "+n);
				Thread.sleep(1000,1000);
				//Thread.sleep(long milliseconds,int nanoseconds)
				//General Form:
				//static void sleep(long milliseconds,int nanoseconds) throws InterruptedException
			}
		}catch(InterruptedException ep){
			System.out.println("Main thread interrutped: "+ep);
		}

	}

}
