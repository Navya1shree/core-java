class AmazonProducts{

static String productName[]={"tv","laptop","washingmachine","opo","redme" };
static  float productPrice[]={100.9f,2903.5f,6798.6f,4600.6f,5698.6f,967.7f};
static double productRating[]={4.5,6.7,5.6,7.8,9.8};
public static void getAmazonProductDetails(){
	
		for(int i=0;i<productName.length;i++){
       System.out.println("ProductName:"+productName[i]);
	   System.out.println("ProductPrice:"+productPrice[i]);
	   System.out.println("productRating:"+productRating[i]);

		
		
}
	
	
}




}