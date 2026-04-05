class Tv {
    public Tv() {
    this("samsung");
  System.out.println("Default Constructor Finished");
  
  
    }
	
 public Tv(String brand) {
  this(brand, 43);
  System.out.println("Brand Constructor Finished");
		
		
    }
 public Tv(String brand, int size) {
      this(brand, size, "HD");
  System.out.println("Size: " + size + " inches");
    }
	
	
	
	
public Tv(String brand, int size, String type) {

        this(brand, size, type, 50000);
        System.out.println("Type: " + type);
		
		
    }
    public Tv(String brand, int size, String type, double price) {
		
		
System.out.println("BASE CONSTRUCTOR");
 System.out.println("Brand: " + brand);
 System.out.println("Size: " + size);
 System.out.println("Type: " + type);
  System.out.println("Price: " + price);
    
	
	
	
	}
	
	
	
	
}