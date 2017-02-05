
public class Shipment extends BoxWeight {
	double cost;
	
	Shipment(double w, double h, double d, double m, double c){
		super(w,h,d,m);
		cost=c;
	}
	Shipment(Shipment obj){
		super(obj);
		cost=obj.cost;
	}
	Shipment(){
		super();
		cost=-1;
	}
	Shipment(double len,double w ,double c){
		super(len,w);
		cost=c;
		
	}
	void show(String msg){
		System.out.println(msg);
	}
}