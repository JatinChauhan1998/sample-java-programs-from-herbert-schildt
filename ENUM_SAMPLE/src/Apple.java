
public enum Apple {
	Jonathan(19,5),Golden(9),Red(29,65),Winesap(34),Cortland(22,66);
	
	private int price,quant;
	Apple(int p,int q){
		price=p;
		quant=q;
	}
	Apple(int p){
		price=p;
		quant=-1;
	}
	Apple(){
		price=-1;
		quant=-1;
	}
	String getPrice(){
		if(quant==-1)
			return String.format("%d $", price);
		else
			return String.format("%d $ for %d items", price,quant);
	}
}
