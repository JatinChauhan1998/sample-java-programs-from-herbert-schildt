/**
 * Created by JOY on 1/28/2017.
 */
public class DemoBoxWeight {
	
	
    public static void main(String[] args) {
        Shipment mybox=new Shipment(23,23,45,23,12.2343);
        Shipment mybox1=new Shipment(12,34,12,56,34.3565);
        Shipment mybox2=new Shipment(34,12,45,56,12.3435);

        double vol;
        mybox.show("Welcome to Alibaba\nOrder ID: 9292\n");
        
        vol=mybox.volume();
        System.out.println("Volume of the Box: "+ vol );
        System.out.println("Weight : "+ mybox.weight+" KG");
        System.out.println("Cost of Shipment: $"+mybox.cost);
        
        vol=mybox1.volume();
        System.out.println("\nVolume of the Box: "+ vol );
        System.out.println("Weight : "+ mybox1.weight+" KG");
        System.out.println("Cost of Shipment: $"+mybox1.cost);
        
        vol=mybox2.volume();
        System.out.println("\nVolume of the Box: "+ vol );
        System.out.println("Weight : "+ mybox2.weight+" KG");
        System.out.println("Cost of Shipment: $"+mybox2.cost);
             
       
    }
}
