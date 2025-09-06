import java.time.LocalDate;

import People.Author;
import People.Member;
import Things.Book;
import Things.Copy;
import Things.Loan;

public class LibraryManager {
    public static void main(String[] args) {
        Author author1 = new Author("JRR", "Tolkien");
        Book book1 = new Book("The Hobbit", "", author1 );
        System.out.println(book1); // Prints: The Hobbit
        System.out.println(book1.getAuthor()); // Prints: J.R.R Tolkien
        System.out.println(book1.getId());

        Copy hobbitCopy1 = new Copy(book1, null, null);
        Member member1 = new Member("John Smith", "jsmith@gmail.com");

        Loan loan1 = new Loan(hobbitCopy1.getId(), hobbitCopy1, null, null, null);

        System.out.println(member1);
        System.out.println(hobbitCopy1.getStatus());
        System.out.println(loan1);
        
    }
}
