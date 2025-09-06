package Things;
import CopyStatus;

public class Copy {
    private long id;
    private Book book; //Which book is this copy of?
    private String barcode;
    private CopyStatus status;

    //Constructor
    public Copy(Book book, String barcode, CopyStatus status) {
        this.book = book;
        this.barcode = barcode;
        this.status = CopyStatus.AVAILABLE;
    }

    //Getters / Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }

    public CopyStatus getStatus() { return status; }
    public void setStatus(CopyStatus status) { this.status = status; }
}