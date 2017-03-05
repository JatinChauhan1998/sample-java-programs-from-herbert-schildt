import java.lang.reflect.Method;

public class Meta {
	@MyAnno(str="Jatin Chauhan",val=100)
	public static void myMeth(){
		Meta ob=new Meta();
		
		//obtain the annotation for this method
		//and display the values of the members.
		
		try{
			//first, get a class object that represents
			//this class.
			
			Class<?> c=ob.getClass();
			
			//now get a method object that represents
			//this method.
			
			Method m=c.getMethod("myMeth");
			
			//next, get the annotation for this class
			MyAnno anno=m.getAnnotation(MyAnno.class);
			
			//finally display the values.
			System.out.println(anno.str()+" "+anno.val());
		}catch(NoSuchMethodException exc){
			System.out.println("Method not Found");
		}
	}
	
	public static void main(String[] args){
		myMeth();
	}

}
