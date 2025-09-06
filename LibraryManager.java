public class LibraryManager {
    public static void main(String[] args) {
        Author author1 = new Author("First", "Last");
        Book book1 = new Book("The Hobbit", "", author1 );
        System.out.println(book1); // Prints: The Hobbit
        System.out.println(book1.getAuthor());
    }
}
