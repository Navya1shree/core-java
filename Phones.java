class Phones{
	
	
float rating;
short storageGB;
String companyName;
String releseDate;
String version;
long noOfDowloads;
	
public Phones(float rating,short storageGB,String companyName,String releseDate,String version,long noOfDowloads){
	System.out.println("phone users"+rating+","+storageGB+","+companyName+","+releseDate+","+version+","+noOfDowloads);
	

}
public void getPhones(){
	System.out.println("rating:"+rating);
	System.out.println("storageGB:"+storageGB);   
	System.out.println("companyName :"+companyName);   
	System.out.println("releseDate:"+releseDate);  
	System.out.println(" version :"+version);  
	System.out.println("No Of Dowloads:"+noOfDowloads);

}
}
