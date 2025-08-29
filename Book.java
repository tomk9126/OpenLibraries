public class Book {
    private String name;

    public Book(String bookName) {
        this.name = bookName;
    }

    @Override
    public String toString() {
        return name;
    } 
    
}