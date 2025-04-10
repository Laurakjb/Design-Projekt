package UI;


/**
 * Lav en beskrivelse af klassen LoanMenu her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class LoanMenu
{
    // instansvariabler - erstat eksemplet herunder med dine egne variable

    /**
     * Konstruktør for objekter af klassen LoanMenu
     */
    public LoanMenu()
    {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            switch (choice) {
                case 1:
                    
                createLoan();
                break;
                
                case 2:
                    
                addFriendByPhoneToLoan();
                break;
                
                case 3:
                    
                addCopyBySerialNumberToLoan();
                break;
                
                case 0: 
                
                System.out.println("Exit system, come agian");
                
                running = false;
                break;
                
            }
    }
    }
    private int writeLoanMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("LOAD MENU");
        System.out.println("1. createloan");
        System.out.println("2. addFriendByPhoneToLoan");
        System.out.println("3. addCopyBySerialNumberToLoan")
        System.out.println("0. Exit system");
        System.out.println("Take your pick");
        return scanner.nextInt();
    }
    public void createLoan(){
        
    }
    
    public addFriendByPhoneToLoan(String phone) {
        return null;
    } 
    public addLPBySerialNumberToLoan() {
        return null;
    }
}
