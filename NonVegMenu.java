class NonVegMenu {
    public void getMenuDetails() {
        System.out.println("getMenuDetails");
    }

    public void checkFoodByFoodName(String foodName) {
		System.out.println("invoking checkFoodByFoodName");
        if (foodName == "Chicken Curry") {
            System.out.println("Available");
        } else if (foodName == "Mutton Biryani") {
            System.out.println("Available");
        } else if (foodName == "Fish Fry") {
            System.out.println("Available");
        } else if (foodName == "Prawn Masala") {
            System.out.println("Available");
        } else if (foodName == "Egg Curry") {
            System.out.println("Available");
        } else if (foodName == "Chicken Tikka") {
            System.out.println("Available");
        } else if (foodName == "Mutton Kebab") {
            System.out.println("Available");
        } else if (foodName == "Fish Curry") {
            System.out.println("Available");
        } else if (foodName == "Chicken Biryani") {
            System.out.println("Available");
        } else if (foodName == "Prawn Fry") {
            System.out.println("Available");
        } else {
            System.out.println("Not Available");
        }
    }
}
