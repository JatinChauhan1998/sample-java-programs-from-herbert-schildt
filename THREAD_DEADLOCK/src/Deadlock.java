
public class Deadlock implements Runnable {
	A a=new A();
	B b=new B();
	
	Deadlock(){
		Thread.currentThread().setName("Main Thread");
		Thread t=new Thread(this, "Racing Thread");
		
		t.start();
		a.foo(b); //get a lock on a in this thread
		
		System.out.println("Back in the Main Thread");
	}
	public void run(){
		b.bar(a);//get lock on b in other thread
		System.out.println("Back in other Thread");
	}
	public static void main(String[] args) {
		new Deadlock();
	}
}
