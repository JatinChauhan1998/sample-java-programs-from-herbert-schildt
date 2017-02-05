import java.util.*;
public class Exec {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int option,item,i=1;
		DStack obj=new DStack();
		obj.Init_Stck(1);
		do{
			System.out.println();
			System.out.println("--MENU--");
			System.out.println("1. Push a Value in The Stack");
			System.out.println("2. Pop a Value from the Stack");
			System.out.println("3. Display Stack");
			System.out.println("4. Exit");
			option=in.nextInt();
			switch(option){
			case 1:
				System.out.println("Enter the Value to be Pushed");
				item=in.nextInt();
				obj.push(item);
				break;
			case 2:
				System.out.println("Popped Item: "+obj.pop());
				obj.Change_Stck(obj.tos);
				break;
			case 3:
				System.out.println("Displaying...");
				obj.display();
				break;
			case 4:
				System.out.println("Exiting...");
				i=0;
				break;
			default:
				System.out.println("Enter a Valid Value");
					
			}
		}while(i==1);

	}

}
