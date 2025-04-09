package model;
import java.util.ArrayList;

/**
 * Lav en beskrivelse af klassen dfgh her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class FriendContainer
{
    private ArrayList<Friend>friends = new ArrayList<>();// instansvariabler - erstat eksemplet herunder med dine egne variabler
    private static FriendContainer _instance;
    /**
     * Konstruktør for objekter af klassen LoanContainer
     */
    private FriendContainer() {
            ArrayList<Friend> friends = new ArrayList<>();
        }
    private static FriendContainer getInstance() {
        if (_instance == null) {
            _instance = new FriendContainer();
        }
        return _instance;
    }
    public Friend findFriendByPhone(String phone) {
        friends.add(phone);
        return null;
    }
    
}

