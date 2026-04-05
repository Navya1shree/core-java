class Library {
    public Library() {
        this("City Library");
    System.out.println("Default Constructor Finished");
	
	
    }

 public Library(String name) {
   this(name, 5000);
  System.out.println("Name Constructor Finished");
		
		
    }

public Library(String name, int books) {
  this(name, books, "Public");
  System.out.println("Books: " + books);
		
		
		
    }

  public Library(String name, int books, String type) {
   this(name, books, type, 200000);
      System.out.println("Type: " + type);
		
		
		
		
    }

    public Library(String name, int books, String type, double cost) {
		
		
        System.out.println("BASE CONSTRUCTOR");
        System.out.println("Name: " + name);
        System.out.println("Books: " + books);
        System.out.println("Type: " + type);
        System.out.println("Cost: " + cost);
    
	
	
	
	
	
	}






}