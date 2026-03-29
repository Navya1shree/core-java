class BluetoothSpeaker{
    String brand;
    float batteryLife; 
    float price;
    boolean waterResistant;

public BluetoothSpeaker(String brand,float batteryLife,float price,boolean waterResistant){
	System.out.println(" users"+brand+","+batteryLife+","+price+","+waterResistant);
	

}
public void getBluetoothSpeaker(){
	System.out.println("batteryLife:"+batteryLife);
	System.out.println("price:"+price);   
	System.out.println("waterResistant :"+waterResistant);   

}
}    
   