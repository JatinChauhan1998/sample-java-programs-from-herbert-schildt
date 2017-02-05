public class FirstThread extends Thread {

	FirstThread(){
		super("Demo Thread");//Calls the Super Class Constructor
		System.out.println("Child Thread "+this);
		start();//Begin execution of the new thread
	}
	
	public void run() {
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread: (1) "+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException ob){
			System.out.println("Exception FirstThread Interrupted :"+ob);
		}
		
		System.out.println("Exiting FirstChild Thread");
		}
		
}