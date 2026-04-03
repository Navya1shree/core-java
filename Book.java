class Book {

   
    static String libraryName = "City Library";

  
    String title;
    String author;
    int pages;
    float rating;
    String genre;

   
    public Book() {

    }

  
    public Book(String title, String author, int pages, float rating, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.rating = rating;
        this.genre = genre;
    }

 
    public void displayBookDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Rating: " + rating);
        System.out.println("Genre: " + genre);
        System.out.println("----------------------------------------");
    }
}