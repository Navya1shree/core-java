class FootballTeam {

    String teamName;
    String captainName;
    static int noOfPlayers = 11;  
    String coachName;
    String ownerName;
    String jerseyColor;

    
    public FootballTeam() {}

  
    public FootballTeam(String teamName, String captainName, String coachName, String ownerName, String jerseyColor) {
        this.teamName = teamName;
        this.captainName = captainName;
        this.coachName = coachName;
        this.ownerName = ownerName;
        this.jerseyColor = jerseyColor;
    }

   
    public void displayTeamDetails() {
        System.out.println("Team name: " + teamName);
        System.out.println("Captain Name: " + captainName);
        System.out.println("No of Players: " + noOfPlayers);  // static variable
        System.out.println("Coach Name: " + coachName);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Jersey Color: " + jerseyColor);
  
    }
}