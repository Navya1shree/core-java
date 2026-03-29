class  AirCooler {
    String brand;
    float coolingArea;
    float price;
    boolean hasWaterTank;
	float rating;

    public AirCooler(String brand,float coolingArea,float price,boolean hasWaterTank,float rating){
	System.out.println(" users"+brand+","+coolingArea+","+price+","+hasWaterTank+","+rating);
	

}
public void getAirCooler(){
	System.out.println("brand:"+brand);
    System.out.println("coolingArea :"+coolingArea);   	

	System.out.println("price:"+price);   
	System.out.println("hasWaterTank :"+hasWaterTank); 
   	
     System.out.println("rating :"+rating);   
}
}    