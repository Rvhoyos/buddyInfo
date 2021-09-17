import java.util.ArrayList;

public class AddressBook {

    BuddyInfo Buddy;
    ArrayList addressBook;


    public void addBuddy(){
    addressBook.add(Buddy);
    }

    public void removeBuddy(){
        addressBook.remove(Buddy);
    }

    public static void main(String[] args) {
        BuddyInfo Buddy = new BuddyInfo("Tom","Carleton",613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy();
        addressBook.removeBuddy();

        System.out.println("Address Book");

    }

}
