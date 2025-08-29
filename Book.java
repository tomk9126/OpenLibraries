//Represents a book, not a particular copy but, as a whole.

public class Book {
    
    private long id;
    private String isbn;
    private String title;
    private String publisher;
    private int year;
    
    //Constructor Class
    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    //Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }


    @Override
    public String toString() {
        return name;
    } 
    
}