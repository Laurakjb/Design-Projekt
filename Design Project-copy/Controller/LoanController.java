package Controller;

import model.LoanContainer;
import model.Loan;
import model.Friend;
import model.Copy;

public class LoanController {
    private LoanContainer loanContainer;

    
    public LoanController() {
      loanContainer = LoanContainer.getInstance();
      
    }
    
    public Loan createLoan(String phone, int serialNumber, int loanNumber, String borrowDate, String returnDate, boolean status) {
       FriendController friendController = new FriendController();
       LPController lpController = new LPController();
        
       
       Friend friend = friendController.findFriendByPhone(phone); 
       if (friend == null) {
           return null;
       }
       Copy copy = lpController.findCopyBySerialNumber(serialNumber);
       if (copy == null) {
           return null;
       }
       Loan loan = new Loan(loanNumber, borrowDate,returnDate, status, friend, copy);
       loanContainer.addLoan(loan);
       return loan;
       
    
    }
}
