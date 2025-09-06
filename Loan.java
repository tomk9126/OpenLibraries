package Things;
import java.time.LocalDate;

import CopyStatus;
import People.Member;

public class Loan {
    private Long id;
    private Member member;
    private Copy copy;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private LocalDate returnDate; //null until returned

    public boolean isActive() { return returnDate == null; }
    
    public boolean isOverdue(LocalDate today) {
        return isActive() && today.isAfter(dueDate);
    }

    //Constructor
    public Loan(Long id, Copy copy, Member member, LocalDate loanDate, LocalDate dueDate) {
        this.id = id;
        this.copy = copy;
        this.member = member;
        this.loanDate = loanDate;
        this.dueDate = dueDate;

        //Update the status of copy object when instantiated
        this.copy.setStatus(CopyStatus.LOANED);
    }

    public void markReturned(LocalDate returnDate) {
        this.returnDate = returnDate;
        this.copy.setStatus(CopyStatus.AVAILABLE);
    }

    //Getters and Setters
    public Long getID() { return id; }
    public void setID(Long id) { this.id = id; }

    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }

    public LocalDate getLoanDate() { return loanDate; }
    public void setLoanDate(LocalDate loanDate) { this.loanDate = loanDate; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }

}
