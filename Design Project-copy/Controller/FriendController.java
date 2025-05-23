package Controller;
import model.FriendContainer;
import model.Friend;

/**
 * Write a description of class FriendCtrl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendController
{
    // instance variables - replace the example below with your own
    private FriendContainer friendContainer;
    private Friend friend;
    /**
     * Constructor for objects of class FriendCtrl
     */
    public FriendController() {
        friendContainer = friendContainer.getInstance();
    
    }
    
    public Friend findFriendByPhone(String phone) {
        return friendContainer.findFriendByPhone(phone);
        
    }
}