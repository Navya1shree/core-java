class FlipkartRunner {

  public static void main(String[] arg) {

    Flipkart Flipkart = new Flipkart();

    boolean login = Flipkart.login("navyashree", "navi@43");
    System.out.println(login);
    
	
	
    String result = Flipkart.login(9036300673L, 8964);
    System.out.println(result);
	
	
    
    String msg = Flipkart.search("watch");
    System.out.println(msg);
	
    msg = Flipkart.search("watch", "Noisefit");
    System.out.println(msg);
	
    
    msg = Flipkart.search("watch", "Noisefit", 1500);
    System.out.println(msg);


    msg = Flipkart.search("watch", "Noisefit", 1500, "black");
    System.out.println(msg);

    msg = Flipkart.search("watch", "Noisefit", 1500, "black", "1GB");
    System.out.println(msg);
	
	
  }
}