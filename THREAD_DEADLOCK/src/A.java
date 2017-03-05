
public class A {
	public void foo(B b){
		String name=Thread.currentThread().getName();
		
		System.out.println(name + "Entered A.foo");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("A's Interrupted" + e);
		}
		System.out.println(name + "Trying to call B.last");
		
		b.last();
	}
	
	synchronized void last(){
		System.out.println("Inside A's Last");
	}

}
