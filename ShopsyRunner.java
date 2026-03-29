class ShopsyRunner{
	public static void main(String[]args){
		
		System.out.println("------First time method calll-----");
		String status  =Shopsy.registerstatus(9036300673l,978,"sachingowda","maddur");
		System.out.println(status);
		System.out.println("------second time method calll-----");
		String status  =Shopsy.registerstatus(9036300673l,688,"punithgowda","bengaluru");
		System.out.println(status);
	}




}