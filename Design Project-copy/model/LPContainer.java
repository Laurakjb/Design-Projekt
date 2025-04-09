package model;
import java.util.ArrayList;

/**
 * Write a description of class LPContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<LP> LP;
    private static LPContainer instance;
    
    private LPContainer() {
        LP = new ArrayList<>();
        
        LP fearless = new LP("Fearless", "Taylor Swift",888, "2022-08-12");
        fearless.addCopy(new Copy(2001, "2024-06-08", 5));
        fearless.addCopy(new Copy(2002, "2024-08-09", 10));
        
        LP pinkFriday = new LP("PinkFriday", "Nicki Minaj",255, "2021-07-04");
        pinkFriday.addCopy(new Copy(2003, "2023-05-05", 15));
        pinkFriday.addCopy(new Copy(2004, "2024-04-04", 20));
        
        LP.add(fearless);
        LP.add(pinkFriday);
    }
    public static LPContainer getInstance() {
        if (instance == null) {
            instance = new LPContainer();
        }
        return instance;
    }
    public Copy findCopyBySeriallNumber (int serialNumber) {
        for (LP lp : LP) {
            Copy copy = lp.findCopyBySerialNumber(serialNumber);
            if (copy !=null) {
                return copy;
            }
        }
        return null;
    }
}