class IplTeam{

 String teamName;
 String captionName;
 static int noofPlayers=11;
 String coachName;
 String ownerName;
 String  jerseyColor;
 
 
 
 public IplTeam(){
	 
 }
 public IplTeam( String teamName,String captionName,String coachName,String ownerName,String  jerseyColor){
    this.teamName=teamName;
    this.captionName=captionName;
    this.coachName=coachName;
    this.ownerName=ownerName;
    this.jerseyColor=jerseyColor;
 }
 
 

public void displayTeamDetails(){
	System.out.println("Team name:"+teamName);
	System.out.println("caption Name:"+captionName);
	System.out.println("no  ofPlayers :"+noofPlayers);
	System.out.println("coach Name:"+coachName);
	System.out.println("owner Name :"+ownerName);
	System.out.println("jersey Color  :"+jerseyColor);

	
	
}



}