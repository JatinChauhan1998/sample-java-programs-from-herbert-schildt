public class ThreadDemo {
	public static void main(String[] args){

		CreateThread th1=new CreateThread("First");
		CreateThread th2=new CreateThread("Second");
		
		System.out.println("First Thread Status: "+(th1.t.isAlive()?"Running":"Stopped"));
		System.out.println("Second Thread Status:"+(th2.t.isAlive()?"Running":"Stopped"));
		
		try{
			System.out.println("Waiting for threads to finish");
			th1.t.join();
			th2.t.join();
		}catch(InterruptedException ob){
			System.out.println("Exception Caught: "+ ob);
		}
		
		System.out.println("First Thread Status: "+(th1.t.isAlive()?"Running":"Stopped"));
		System.out.println("Second Thread Status: "+(th2.t.isAlive()?"Running":"Stopped"));
		
		System.out.println("Main Thread Exiting");
	}

}
