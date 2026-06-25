import java.util.ArrayList;
import java.util.HashMap;

/***
 * Contact Book which stores the user data
 *
 */
public class ContactBook {
    public ContactBook() {}


    HashMap<String, ArrayList<String>> savedContacts = new HashMap<>();
    ArrayList<String> contactData = new ArrayList<>();



    public boolean addContact(String name, ArrayList<String> details) {


        // if there isn't an entry for the contact we can add it
        if (getContact(name) == null) {
            savedContacts.put(name, details);
            return true;

        }

        return false; // if there's already an entry;

    }

    /**
     * Returns contact's details
     * @param name
     * @return ArrayList of details
     */
    public ArrayList<String> getContact(String name) {
        return savedContacts.get(name);
    }


    /**
     * Removes the key-value pair and returns the value.
     * @param name
     * @return ArrayList<String> containing the details of the contact being removed
     */
    public ArrayList<String> removeContact(String name) {
        return savedContacts.remove(name);
    }

    /**
     * Puts all the keys into a list
     * @return a list of all the keys AKA names.
     */
    public ArrayList<String> getAllContacts() {
        ArrayList<String> contactList = new ArrayList<>(savedContacts.keySet());
        return contactList;
    }


}
