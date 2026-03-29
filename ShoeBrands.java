class ShoeBrands{

static String ShoeNames[]={"Nike", "Adidas", "Puma", "Reebok", "Skechers", "Woodland", "Bata", "Fila" };
static  float ShoePrice[]={1200.67f, 1500.55f, 1800.55f, 2000.66f, 2200.44f, 2500.5f, 3000.6f, 3500.9f};
static double ShoeQuality[]={10, 9, 8, 7, 6, 5, 4, 3};
static int ShoeSize[]={6, 7, 8, 9, 10, 11, 12, 13 };
public static void getShoeBrandsDetails(){
	
		for(int i=0;i<ShoeNames.length;i++){
       System.out.println(" ShoeNames:"+ShoeNames[i]);
	   System.out.println("ShoePrice:"+ShoePrice[i]);
	   System.out.println("ShoeQuality:"+ShoeQuality[i]);
	   System.out.println("ShoeSize:"+ShoeSize[i]);
	  	  	   System.out.println("----------------------------------------");

}
	
}

}