import java.util.ArrayList;

public class AddressBook {
    private ArrayList addressBook;

    public AddressBook(){

        addressBook = new ArrayList<>();
    }


    public void addBuddy(BuddyInfo Buddy){
    if(Buddy != null){
        addressBook.add(Buddy);
        }
    }

    public void removeBuddy(int index) {
        if (index >= 0 && index < addressBook.size()) {
            addressBook.remove(index);
        }
    }
    public static void main(String[] args) {
        BuddyInfo Buddy = new BuddyInfo("Tom","Carleton",613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(Buddy);
        addressBook.removeBuddy(0);

        System.out.println("Address Book");

    }//test

}
