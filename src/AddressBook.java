import java.util.ArrayList;

public class AddressBook {

    BuddyInfo Buddy;
    ArrayList addressBook = new ArrayList();


    public void addBuddy(){
    addressBook.add(Buddy);
    }

    public void removeBuddy(){
        addressBook.remove(Buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

    }

}
