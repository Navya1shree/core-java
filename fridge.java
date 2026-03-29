class fridge{

static String fridgeNames[]={"Samsung", "LG", "Whirlpool", "Godrej", "Haier", "Panasonic", "Bosch", "Hitachi" };
static  float fridgeprice[]={120000.50f, 115500.75f, 75000.25f, 110000.40f, 195000.60f, 125000.30f, 90000.10f, 95000.20f};
static double fridgeRating[]={10, 9, 8, 7, 6, 5, 4, 3};
static int fridgeWaranty[]={1, 2, 3, 4, 5, 6, 7, 8};
public static void getfridgeNamesDetails(){
	
		for(int i=0;i<fridgeNames.length;i++){
       System.out.println("fridgeNames :"+fridgeNames[i]);
	   System.out.println("fridgeprice:"+fridgeprice[i]);
	   System.out.println("fridgeRating:"+fridgeRating[i]);
	   System.out.println("fridgeWaranty:"+fridgeWaranty[i]);
	  
}
	
}

}