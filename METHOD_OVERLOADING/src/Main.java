
public class Main {

	public static void main(String[] args) {
		Shape cy=new Shape(10,10);
		Shape rec=new Shape(2,5);
		Shape sq=new Shape(3);
		
		int result;
		
		result=cy.volCy();
		
		System.out.println("Cylinder: "+result);
		
		result=rec.arRec();
		
		System.out.println("Rectangle: "+result);
		
		result=rec.arSq();
		
		System.out.println("Square: "+result);
	}

}
