
public class Shape {
	int length,breadth;
	int volume;
	
	Shape(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	int volCy(){
		volume=(int)(2*3.14*length*breadth);
		return volume;
	}
	int arRec(){
		return length*breadth;
	}
	Shape(int length){
		this.length=length;
	}
	int arSq(){
		return length*length;
	}

}
