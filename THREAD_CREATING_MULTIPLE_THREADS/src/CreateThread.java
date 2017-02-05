
public class CreateThread implements Runnable {
	
	Thread t;
	String name;
	CreateThread(String name){
		this.name=name;
		t=new Thread(this,name);
		System.out.println("Starting Thread: "+name);
		t.start();
	}
	
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+" "+i);
				Thread.sleep(200);
			}
		}catch(InterruptedException ex){
			System.out.println("Exception : "+ex);
		}
		System.out.println("Exiting Thread"+ name);
	}
}
