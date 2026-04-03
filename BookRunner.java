class BookRunner {
    public static void main(String[] args) {

      
        Book b1 = new Book();
        b1.title = "The Alchemist";
        b1.author = "Paulo Coelho";
        b1.pages = 208;
        b1.rating = 9.5f;
        b1.genre = "Fiction";
        b1.displayBookDetails();

       
        Book b2 = new Book("Atomic Habits", "James Clear", 320, 9.0f, "Self-help");
        b2.displayBookDetails();

        Book b3 = new Book("1984", "George Orwell", 328, 9.2f, "Dystopian");
        b3.displayBookDetails();

        Book b4 = new Book("Sapiens", "Yuval Noah Harari", 498, 9.1f, "History");
        b4.displayBookDetails();

        Book b5 = new Book("The Silent Patient", "Alex Michaelides", 336, 8.8f, "Thriller");
        b5.displayBookDetails();

        Book b6 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 288, 8.9f, "Finance");
        b6.displayBookDetails();

        Book b7 = new Book("To Kill a Mockingbird", "Harper Lee", 281, 9.3f, "Classic");
        b7.displayBookDetails();

        Book b8 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, 9.0f, "Classic");
        b8.displayBookDetails();

        Book b9 = new Book("Thinking, Fast and Slow", "Daniel Kahneman", 499, 9.1f, "Psychology");
        b9.displayBookDetails();

        Book b10 = new Book("The Power of Habit", "Charles Duhigg", 371, 9.0f, "Self-help");
        b10.displayBookDetails();
    }
}