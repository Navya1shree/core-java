class BikeNames{

static String bikeNames[]={"Apache", "Pulsar", "Splendor", "Unicorn", "Duke", "FZ", "Shine", "Glamour"};
static  float bikePrice[]={120000.50f, 115500.75f, 75000.25f, 110000.40f, 195000.60f, 125000.30f, 90000.10f, 95000.20f};
static double bikeRating[]={4.5, 4.3, 4.2,4.4,4.6,4.1,4.0,4.3};
static int bikeMilege[]={45,50,65,55,35,45,60,58};
public static void getBikeNamesDetails(){
	
		for(int i=0;i<bikeNames.length;i++){
       System.out.println("Bike Names:"+bikeNames[i]);
	   System.out.println("bikePrice:"+bikePrice[i]);
	   System.out.println("bikeRating:"+bikeRating[i]);
	   System.out.println("bikeMilege:"+bikeMilege[i]);
	  	  	   System.out.println("----------------------------------------");

}
	
}

}