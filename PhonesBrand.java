class PhonesBrand{

static String PhoneNames[]={"iPhone", "Samsung Galaxy", "Redmi", "Realme", "OnePlus", "Vivo", "Oppo", "Motorola" };
static  float PhonePrice[]={15000, 20000, 18000, 22000, 30000, 17000, 25000, 21000};
static double PhoneQuality[]={10, 9, 8, 7, 9, 8, 7, 8 };
static int PhoneStorage[]={64, 128, 256, 512, 128, 64, 256, 512};
public static void getPhonesBrandDetails(){
	
		for(int i=0;i<PhoneNames.length;i++){
       System.out.println(" PhoneNames:"+PhoneNames[i]);
	   System.out.println("PhonePrice:"+PhonePrice[i]);
	   System.out.println("PhoneQuality:"+PhoneQuality[i]);
	   System.out.println("PhoneStorage:"+PhoneStorage[i]);
	  	  	   System.out.println("----------------------------------------");

}
	
}

}