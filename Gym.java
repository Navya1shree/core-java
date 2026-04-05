class Gym {
	
 public Gym() {
  this("FitZone");
 System.out.println("Default Constructor Finished");
 
 
    }

    public Gym(String name) {

        this(name, 100);
        System.out.println("Name Constructor Finished");
		
		
    }

public Gym(String name, int members) {
 this(name, members, "Premium");
   System.out.println("Members: " + members);
		
		
    }

    public Gym(String name, int members, String type) {
        this(name, members, type, 50000);
        System.out.println("Type: " + type);
    }

    public Gym(String name, int members, String type, double fee) {
		
		
        System.out.println("BASE CONSTRUCTOR");
        System.out.println("Name: " + name);
        System.out.println("Members: " + members);
        System.out.println("Type: " + type);
        System.out.println("Fee: " + fee);
   





   }










}