class TV{
    String brand;
    String model;
    float screenSize;
    boolean smart;
    String resolution;

    public TV(String brand,String model,float screenSize,boolean smart,String resolution){
	System.out.println(" users"+brand+","+model+","+screenSize+","+smart+","+resolution);
	

}
public void getTV(){
	System.out.println("brand:"+brand);
	System.out.println("model:"+model);   
	System.out.println("screenSize :"+screenSize);   
	System.out.println("smart:"+smart);  
	System.out.println(" resolution :"+resolution);  

}
}
 