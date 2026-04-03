class IplTeamRunner{
	
	public static void main(String []team){
		IplTeam rcb=new IplTeam();
		rcb.teamName="RCB";
		rcb.captionName="rajath patidar";	
		rcb.coachName="DK";
		rcb.ownerName="US";
		rcb.jerseyColor="red black";
		
		
	rcb.displayTeamDetails();
	
	IplTeam csk=new IplTeam("CSK","Ruthuraj","Stephen fleming","kashi vishwanath","yellow");
	csk.displayTeamDetails();
	System.out.println("----------------------------------------");
	
	IplTeam mi = new IplTeam("MI", "Rohit Sharma", "Mahela Jayawardene", "Reliance", "blue");
    mi.displayTeamDetails();
	System.out.println("----------------------------------------");

    IplTeam kkr = new IplTeam("KKR", "Shreyas Iyer", "Brendon McCullum", "Shah Rukh Khan", "purple gold");
     kkr.displayTeamDetails();
	System.out.println("----------------------------------------");

    IplTeam dc = new IplTeam("DC", "David Warner", "Lalchand Rajput", "GMR Group", "blue red");
    dc.displayTeamDetails();
	System.out.println("----------------------------------------");

    IplTeam srh = new IplTeam("SRH", "Kane Williamson", "Tom Moody", "Sun TV Network", "orange");
    srh.displayTeamDetails();
		System.out.println("----------------------------------------");

	IplTeam rr = new IplTeam("RR", "Sanju Samson", "Dharmesh Patel", "Rajasthan Royals Sports", "pink blue");
    rr.displayTeamDetails();
	System.out.println("----------------------------------------");

   IplTeam lsg = new IplTeam("LSG", "KL Rahul", "Andy Flower", "Gautam Gambhir", "yellow blue");
  lsg.displayTeamDetails();
	System.out.println("----------------------------------------");

  IplTeam gt = new IplTeam("GT", "Hardik Pandya", "Gary Kirsten", "CVC Capital", "blue silver");
 gt.displayTeamDetails();
	System.out.println("----------------------------------------");

  IplTeam pbks = new IplTeam("PBKS", "Shikhar Dhawan", "Febin Ramesh", "PREMIER LEAGUE SPORTS", "red white");
  pbks.displayTeamDetails();
		System.out.println("----------------------------------------");

	}






}