class Cinema {
	
    public Cinema() {
		this("PVR");
    System.out.println("Default Constructor Finished");
	
    }

    public Cinema(String name) {
   this(name, 200);
System.out.println("Name Constructor Finished");
		
    }

    public Cinema(String name, int seats) {
		
        this(name, seats, "IMAX");
        System.out.println("Seats: " + seats);
		
	
    }

 public Cinema(String name, int seats, String type) {
   this(name, seats, type, 1000000);
  System.out.println("Type: " + type);
    }

    public Cinema(String name, int seats, String type, double revenue) {
		
        System.out.println("BASE CONSTRUCTOR");
        System.out.println("Name: " + name);
        System.out.println("Seats: " + seats);
        System.out.println("Type: " + type);
        System.out.println("Revenue: " + revenue);
		
		
		
    }
	
	
	
	
	
	
	
	
	
	
}