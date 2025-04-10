package model;
import java.util.List;

public class Loan
{
    
    private int loanNumber;
    private String borrowedDate;
    private String returnDate;
    private String status;
    private Friend friend;
    private Copy copy;

    /**
     * Konstruktør for objekter af klassen Loan
     */
    public Loan(int loanNumber, String borrowDate, String returnDate, String status, Friend friend, Copy copy) {
        this.loanNumber = loanNumber;
        this.borrowedDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
        this.friend = friend;
        this.copy = copy;
        
        
    }
    
    
    
    //public Loan loan(Friend f) {
        //Loan newLoan = new Loan(int loanNumber, String borrowDate, String returnDate, boolean status,
        //new copy(int purchasePrice, String purchaseDate, int serialNumber));
        
        //return newLoan;
   // }
    
    public Copy addCopyToLoan(Copy copy) {
        return copy;
    }
    
    public Friend addFriendToLoan(Friend friend) {
        return friend;
    }
    
    public void setStatus() {
        this.status = status;
    }
   
    public void setBorrowedDate(String borrowedDate) {
        this.borrowedDate = borrowedDate;
    }
    
}    
