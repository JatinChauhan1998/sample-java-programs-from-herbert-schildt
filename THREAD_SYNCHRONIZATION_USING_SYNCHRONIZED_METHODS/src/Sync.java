
public class Sync {
	public static void main(String[] args){
		Callme target=new Callme();
		Caller ob1=new Caller(target,"Hello");
		Caller ob2=new Caller(target,"Synchronization");
		Caller ob3=new Caller(target,"World");
		
		//wait for thread to end
		
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException ob){
			System.out.println("Exception: "+ob);
		}
	}
}
