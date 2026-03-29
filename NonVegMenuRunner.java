class NonVegMenuRunner {
    public static void main(String[] args) {

        NonVegMenu northIndian = new NonVegMenu();
        northIndian.getMenuDetails();
        northIndian.checkFoodByFoodName("Chicken Curry");
        northIndian.checkFoodByFoodName("chiken chaps");
        northIndian.checkFoodByFoodName("Mutton Kebab");
        northIndian.checkFoodByFoodName("egg kabab");
        System.out.println("------------------");

        NonVegMenu southIndian = new NonVegMenu();
        southIndian.getMenuDetails();
        southIndian.checkFoodByFoodName("egg burji");
        southIndian.checkFoodByFoodName("Chicken Tikka");
        southIndian.checkFoodByFoodName("fish kabab");
        southIndian.checkFoodByFoodName("Fish Curry");
        System.out.println("------------------");

        NonVegMenu chineseMenu = new NonVegMenu();
        chineseMenu.getMenuDetails();
        chineseMenu.checkFoodByFoodName("Chicken Biryani");
        chineseMenu.checkFoodByFoodName("Prawn Fry");
        chineseMenu.checkFoodByFoodName("egg rice");
        chineseMenu.checkFoodByFoodName("Chicken Curry");
        System.out.println("------------------");

        NonVegMenu continentalMenu = new NonVegMenu();
        continentalMenu.getMenuDetails();
        continentalMenu.checkFoodByFoodName("Chicken Tikka");
        continentalMenu.checkFoodByFoodName("Mutton Kebab");
        continentalMenu.checkFoodByFoodName(" egg rice");
        continentalMenu.checkFoodByFoodName("Fish Curry");
        System.out.println("------------------");

        NonVegMenu specialMenu = new NonVegMenu();
        specialMenu.getMenuDetails();
        specialMenu.checkFoodByFoodName("Mutton Biryani");
        specialMenu.checkFoodByFoodName("egg burji");
        specialMenu.checkFoodByFoodName("Chicken Biryani");
        specialMenu.checkFoodByFoodName("goti goyu");
        System.out.println("------------------");
    }
}