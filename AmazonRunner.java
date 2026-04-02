class AmazonRunner {

  public static void main(String[] arg) {

    Amazon amazon = new Amazon();

    boolean login = amazon.login("navyashree", "navi@43");
    System.out.println(login);
    
	
	
    String result = amazon.login(9036300673L, 8964);
    System.out.println(result);
	
	
    
    String msg = amazon.search("phone");
    System.out.println(msg);
	
    msg = amazon.search("phone", "Redmi");
    System.out.println(msg);
	
    
    msg = amazon.search("phone", "Redmi", 40000);
    System.out.println(msg);


    msg = amazon.search("phone", "Redmi", 40000, "white");
    System.out.println(msg);

    msg = amazon.search("phone", "Redmi", 40000, "white", "8GB");
    System.out.println(msg);
	
	
  }
}