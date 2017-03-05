
public class Q {
	
	int n;
	boolean valueSet=false;
	
	synchronized int get(){
		while(!valueSet)
			try{
				wait();
			}catch(InterruptedException ob){
				System.out.println("Exception Caught");
			}
			System.out.println("Got: "+n);
			valueSet=false;
			notify();
			return n;
		}
		
	synchronized void put(int n){
		while(valueSet)
			try{
				wait();
			}catch(InterruptedException ob){
				System.out.println("Exception Caught");
			}
			this.n=n;
			valueSet=true;
			System.out.println("Put: "+n);
			notify();
		}
		
	}