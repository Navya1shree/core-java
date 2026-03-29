class Menu1Runner{

public static void main(String[] food){
	Menu amaravathi=new Menu();
	amaravathi.getMenuDetails();
	amaravathi.checkFoodByFoodName("chicken fride rice");
	amaravathi.checkFoodByFoodName("poori");
	amaravathi.checkFoodByFoodName("bath");
	amaravathi.checkFoodByFoodName("kaba");
	amaravathi.checkFoodByFoodName("biriyani");
	

        String result = amaravathi.checkFoodByFoodName("Idli");
        System.out.println(result);


}
}