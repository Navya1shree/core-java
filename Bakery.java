class Bakery {
 public Bakery() {
	 
   this("Sweet Oven");
System.out.println("Default Constructor Finished");
    }

  public Bakery(String name) {
        this(name, 50);
		
   System.out.println("Name Constructor Finished");
    }
	
	

    public Bakery(String name, int items) {
    this(name, items, "Veg");
   System.out.println("Items: " + items);
   
   
    }

    public Bakery(String name, int items, String type) {
        this(name, items, type, 10000);
        System.out.println("Type: " + type);
    }

    public Bakery(String name, int items, String type, double price) {
		
		
        System.out.println("BASE CONSTRUCTOR");
        System.out.println("Name: " + name);
        System.out.println("Items: " + items);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}