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
        friendContainer = new FriendContainer.getInstance();
    }
    public void createFriend(String phone) {
        Friend freind = new friend(phone);
        friendContainer.addFriend(friend);
    }
    
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Friend findFriendByPhone(int phone) {
        return friendContainer.findFriendByPhone(phone);
        
    }
}
