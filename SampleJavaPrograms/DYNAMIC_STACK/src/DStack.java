
public class DStack implements IntStack {
	private int stck[];
	int tos;
	
	void Init_Stck(int size) {
		stck=new int[size];
		tos=-1;
	}
	int Change_Stck(int size){
		return stck[size];
	}
	
	public void push(int item){
		if(tos==stck.length-1){
			int temp[]=new int[stck.length+1];
			for(int i=0;i<stck.length;i++)temp[i]=stck[i];
			stck=temp;
			stck[++tos]=item;
		}
		else
			stck[++tos]=item;
	}
	public int pop(){
		if(tos<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else return stck[tos--];
	}
	
	public void display(){
		for(int x=0;x<stck.length;x++){
			System.out.print(stck[x]+" ");
		}
		System.out.println();
	}

}
