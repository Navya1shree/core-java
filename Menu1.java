class Menu1{
	public void getMenu1Details(){
		System.out.println("Invoking getMenu1Details");
		}
           public String checkFoodByFoodName(String foodName) {
          System.out.println("invoking checkFoodByFoodName");
            String result="Not available";
			if(foodName("Idli")){
				result="available"
			}
            else if (foodName("biriyani")){
             result="available"
=
			}
	        else if (foodName("poori")){
				result="available"
			}
             else if (foodName("kabab")){
				result="available"
			}
            else if (foodName("chapathi")){
				result="available"
			}else{
				System.out.println(foodName+"is not Available");
	}
	return result;
		
		}
}
