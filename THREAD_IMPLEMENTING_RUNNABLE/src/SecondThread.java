
public class SecondThread implements Runnable {
    
	Thread t;
	
	SecondThread(){
		//Create a new, Second Thread
		t=new Thread(this,"Demo SecondThread");
		System.out.println("Child Thread: "+t);
		t.start();
		
	}
	
	public void run() {
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread (2): "+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException ob){
			System.out.println("Exception SecondNewThread Interrupted :"+ob);
		}
		
		System.out.println("Exiting SecondChild Thread");
		}

}
