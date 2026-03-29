class Refrigerator{
    String brand;
    float capacity;
    String type; 
    float price;
    boolean hasFreezer;

public Refrigerator(String brand,float capacity,String type,float price,boolean hasFreezer){
	System.out.println(" users"+brand+","+capacity+","+type+","+price+","+hasFreezer);
	

}
public void getRefrigerator(){
	System.out.println("brand:"+brand);
	System.out.println("capacity:"+capacity);   
	System.out.println("type :"+type);   
	System.out.println("hasFreezer:"+hasFreezer);  
	System.out.println(" price :"+price);  

}
}    