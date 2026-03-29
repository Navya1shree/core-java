class VideoGame {
    String name;
    String platform;
    float sizeInGB;
    float rating;
    String developer;

    public VideoGame(String name,String platform,float sizeInGB,float rating, String developer){
	System.out.println(" users"+name+","+platform+","+sizeInGB+","+rating+","+developer);
	

}
public void getVideoGame(){
	System.out.println("name:"+name);
    System.out.println("platform :"+platform);   	

	System.out.println("sizeInGB:"+sizeInGB);   
	System.out.println("rating :"+rating); 
   	
     System.out.println("developer :"+developer);   
}
}    
   

