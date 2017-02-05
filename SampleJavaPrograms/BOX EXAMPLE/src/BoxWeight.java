/**
 * Created by JOY on 1/28/2017.
 */
public class BoxWeight extends Box {
    double weight;
    int x=24;
    BoxWeight(double w, double h, double d, double m){
        /*weight=w;
        height=h;
        depth=d;
        instead write super
        */
    	
        super(w,h,d); //calls the superclass constructor
        weight=m;
    }
    
    BoxWeight(BoxWeight obj){
    	super(obj);
    	weight=obj.weight;
    	   	
    }
    BoxWeight() {
		super();
		weight=-1;
	}
    BoxWeight(double len,double m){
    	super(len);
    	weight=m;
    }
    }

