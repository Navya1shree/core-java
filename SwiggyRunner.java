class SwiggyRunner {

  public static void main(String[] arg) {

    Swiggy Swiggy = new Swiggy();

    boolean login = Swiggy.login("navyashree", "navi@43");
    System.out.println(login);
    
	
	
    String result = Swiggy.login(9036300673L, 8964);
    System.out.println(result);
	
	
    
    String msg = Swiggy.search("Biriyani");
    System.out.println(msg);
	
    msg = Swiggy.search("Biriyani", "chikan biriyani");
    System.out.println(msg);
	
    
    msg = Swiggy.search("Biriyani", "chikan biriyani", 150);
    System.out.println(msg);


    msg = Swiggy.search("Biriyani", "chikan biriyani", 150, "MandyaStyle");
    System.out.println(msg);

    msg = Swiggy.search("Biriyani", "chikan biriyani", 150, "MandyaStyle", 2);
    System.out.println(msg);
	
	
  }
}