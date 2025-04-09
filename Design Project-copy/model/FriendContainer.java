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
    private ArrayList<Friend>friends;// instansvariabler - erstat eksemplet herunder med dine egne variabler
    private static FriendContainer _instance;
    /**
     * Konstruktør for objekter af klassen LoanContainer
     */

    private FriendContainer() {
            friends = new ArrayList<>();
        }
    private static FriendContainer getInstance() {
        if (_instance == null) {
            _instance = new FriendContainer();
        }
        return _instance;
    }
    public Friend addFriendByPhone(Friend friend) {
        this.friends.add(friend);
        friend.setPhone(friend);
        friend.add(friend);
        
    }
    public Friend findFriendByPhone(String phone) {
        Friend friend = null;
        boolean found = false;
        int i = 0;
        while (!found && i < friends.size()){
            Friend f = friends.get(i);
            if (f.getPhone () == phone){
                friend = f;
                found = true;
            }
            else {i++;}
        }
        return friend;
    }
}

