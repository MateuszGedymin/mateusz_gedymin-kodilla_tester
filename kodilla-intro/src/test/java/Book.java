public class Book {
    private final String author;
    private final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of() {
        return new Book("Isaac Asimov", "The Galaxy");
    }

   public static void main(String[] args) {
       System.out.println(Book.of().author);
       System.out.println(Book.of().title);
   }


}
