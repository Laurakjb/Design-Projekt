package UI;
import java.util.Scanner;


/**
 * Write a description of class LoanMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanMenu{
    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
        
    }
    public CreateLoan(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Phone Number");
        String phone = getStringFromUser(keyboard);
        
        System.out.println("Serial Number");
        int serialNumber = getIntergetFromUser(keyBoard);
        
        System.out.println("Loan Number");
        int loanNumber = getIntergetFromUser(keyBoard);
        
        System.out.println("Borrowed Date");
        String borrowedDate = getStringFromUser(keyboard);
        
        System.out.println("Return Date");
        String returnDate = getStringFromUser(keyboard);
        
        System.out.println("Status");
        Boolean status = getStringFromUser(keyboard);
        
        
        LoanController loanController = new LoanController();
        loanController.createLoan(phone, serialNumber, loanNumber, borrowedDate, returnDate, status);
    
    }
    public void start() {
        loanMenu();
    }
    private void loanMenu() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            switch (choice) {
                case 1:
                    createLoan();
                    System.out.println("create loan");
                    break;
                case 0:
                    running = false;
                    break;
                
            }
        }
    }
    private int writeLoanMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("LOAN MENU");
        System.out.println(" [1] create loan");
        System.out.println(" [0] Exit system");
        System.out.println("\n vælg");
        int choice = getIntergetFromUser(keyboard);
        return choice;
  
    }
    private int getIntergetFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input only numbers");
            keyboard.nextInt();
        }
        return keyboard.nextInt();
    }
    private int getStringFromUser(Scanner keyboard) {
        while (!keyboard.hasNextLine()) {
            System.out.println("Kun bogstaver");
            keyboard.nextLine();
        }
        return keyboard.nextLine();
    }
}