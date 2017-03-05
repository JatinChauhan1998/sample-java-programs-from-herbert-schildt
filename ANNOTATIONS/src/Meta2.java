import java.lang.annotation.Annotation;
import java.lang.reflect.*;

@What(description="Test")
@MyAnno(str="Meta",val=99)
public class Meta2 {
	
	@What(description="Test Method")
	@MyAnno(str="Testing",val=100)
	public static void myMeth(){
		Meta2 ob=new Meta2();
	try{
		Annotation annos[]=ob.getClass().getAnnotations();
		System.out.println("All meta for Meta2:");
		for(Annotation a:annos)
			System.out.println(a);
		
		System.out.println();
		
		Method m=ob.getClass().getMethod("myMeth");
		annos=m.getAnnotations();
		
		System.out.println("All annos for myMeth:");
		for(Annotation a:annos)
			System.out.println(a);
		System.out.println();
		
	}catch(NoSuchMethodException ex){
		System.out.println("No such methods found");
	}
		
	}
	public static void main(String[] args) {
		myMeth();
	}
}
