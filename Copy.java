public class Copy {
    private long id;
    private long bookId; //Which book is this copy of?
    private String barcode;
    private String status; //'Available' 'Loaned' 'Lost' 'Damaged'

    //Constructor
    public Copy(long bookid, String barcode, String status) {
        this.bookId = bookid;
        this.barcode = barcode;
        this.status = "Available";
    }

    //Getters / Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getBookId() { return bookId; }
    public void setBookId(Long bookId) { this.bookId = bookId; }

    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}