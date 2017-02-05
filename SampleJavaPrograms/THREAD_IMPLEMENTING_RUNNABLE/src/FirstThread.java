
public class FirstThread implements Runnable {

	Thread t;
	
	FirstThread(){
		//Create a new, Second Thread
		t=new Thread(this, "Demo NewThread");
		System.out.println("Child Thread: "+t);
		t.start();
		
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