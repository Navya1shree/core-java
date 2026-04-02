class YoutubeRunner{

  public static void main(String[] arg){
   Youtube tube=new Youtube();
   String msg=tube.search("Gaja");
   System.out.println(msg);
   msg=tube.search("Gaja","Darshan");
   System.out.println(msg);
   boolean login=tube.login("Navya","Navya@43");
   System.out.println(login);
   String result=tube.login("navyashre43@gmail.com","Navya@43","a be123");
   System.out.println(result);
   
  }
}