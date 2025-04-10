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
    private ArrayList<Friend>friends;
    private static FriendContainer instance;
    private Friend friend;
    /**
     * Konstruktør for objekter af klassen LoanContainer
     */

    private FriendContainer() {
        friends = new ArrayList<>();
        friends.add(new Friend("Anna Hansen", "12345678", "sti 1", 8000, "Aalborg"));
        friends.add(new Friend("Peter Nielsen", "98765432", "sti 2", 9000, "Aalborg"));
        friends.add(new Friend("Mette Larsen", "23456789", "Sti 3", 5000, "Aalborg"));
    }
    public static FriendContainer getInstance() {
        if (instance == null) {
            instance = new FriendContainer();
        }
        return instance;
    }
    public boolean addFriend(Friend friend) {
        return friends.add(friend);
    }
    public ArrayList<Friend> getFriends() {
        return friends;
    }
    public Friend findFriendByPhone(String phone) {
    int i = 0;
    while (i < friends.size()) {
        Friend friend = friends.get(i); 
        if (friend.getPhone().equals(phone)) {
            return friend; 
        }
        i++; 
    }
    return null; 
    }
    
}

