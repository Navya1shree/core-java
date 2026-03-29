 class SocialMediaPosts{
String userName;
String content;
float views;
String postsDate;
String platformName;
long noOfLikes;
long noOfShares;

public SocialMediaPosts(String userName,String content,float views,String postsDate,String platformName,long noOfLikes,long noOfShares){
	System.out.println("i am socialmedia constracter"+"constructor with parameter:"+userName+","+content+","+views+","+postsDate+","+platformName+","+noOfLikes+","+noOfShares);

	
}
 public void getSocialMediaPosts(){
	System.out.println("content:"+content);
	System.out.println("views:"+views);   
	System.out.println("Post Date:"+postsDate);   
	System.out.println("Platform Name:"+platformName);  
	System.out.println("No Of Likes:"+noOfLikes);  
	System.out.println("No Of Shares:"+noOfShares);

 }
 
 }