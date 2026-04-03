class Serial{
	
static String chanelName="Zee Kannada";
 String serialName;
 String heroName;
 String heroineName;
 String serialTime;
 String  producerName;
 String  vilanName;
 
 
 public Serial(){
	 
 }
 public Serial( String serialName,String heroName,String heroineName,String serialTime,String  producerName,String vilanName){
    this.serialName=serialName;
    this.heroName=heroName;
    this.heroineName=heroineName;
    this.serialTime=serialTime;
    this.producerName=producerName;
	this.vilanName=vilanName;
 }
 
 

public void displaySerialDetails(){
	        System.out.println("Channel Name: " + chanelName); 
	System.out.println("serial name:"+serialName);
	System.out.println("hero Name:"+heroName);
	System.out.println(" heroine Name :"+heroineName);
	System.out.println("serial Time:"+serialTime);
	System.out.println("producer Name :"+producerName);
	System.out.println("vilan Name  :"+vilanName);

	
	
}



}