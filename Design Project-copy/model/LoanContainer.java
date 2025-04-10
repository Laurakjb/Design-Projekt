package model;
import java.util.ArrayList;


/**
 * Write a description of class LoanContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer
{
    private ArrayList<Loan>loans;
    private static LoanContainer instance;
    private Loan loan;

    /**
     * Constructor for objects of class LoanContainer
     */
    public LoanContainer() {
        loans = new ArrayList<>();
    }
    
    public static LoanContainer getInstance() {
        if (instance == null) {
            instance = new LoanContainer();
        }
        return instance;
    }
    
    public ArrayList<Loan> getLoans() {
        return loans;
    }
    /*public Friend findFriendByPhone(String phone) {
    int i = 0;
    while (i < friends.size()) {
        Friend friend = friends.get(i); 
        if (friend.getPhone().equals(phone)) {
            return friend; 
        }
        i++; 
    }
    return null; 
    }*/
    public void addToLoan(Loan l) {
        //return FriendController.getIstance().FriendContainer.getInstance(phone);
        //return LpController.getIstance().LPContainer.getIstance(serialNumber);
    }
}
