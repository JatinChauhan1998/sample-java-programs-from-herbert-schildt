
public class B {
	public void bar(A a){
		String name=Thread.currentThread().getName();
		
		System.out.println(name + "Entered A.foo");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("B's Interrupted" + e);
		}
		System.out.println(name + "Trying to call A.last");
		
		a.last();
	}
	
	synchronized void last(){
		System.out.println("Inside B's Last");
	}
}
