package Main;

import java.util.ArrayList;
import java.util.List;


public class ContactService {


  private List<Contact> contactList = new ArrayList<>();


  public void newContact(String Id, String firstname, String lastname, String phonenumber,
                         String address) {
    Contact contact =
        new Contact(Id, firstname, lastname, phonenumber, address);
    contactList.add(contact);
  }

  public void deleteContact(String id) throws Exception {
    contactList.remove(searchForContact(id));
  }

  public void updateFirstName(String id, String firstName) throws Exception {
    searchForContact(id).updateFirstName(firstName);
  }

  public void updateLastName(String id, String lastName) throws Exception {
    searchForContact(id).updateLastName(lastName);
  }

  public void updatePhoneNumber(String id, String phoneNumber)
      throws Exception {
    searchForContact(id).updatePhoneNumber(phoneNumber);
  }

  public void updateAddress(String id, String address) throws Exception {
    searchForContact(id).updateAddress(address);
  }

  public List<Contact> getContactList() { return contactList; }

  private Contact searchForContact(String id) throws Exception {
    int index = 0;
    while (index < contactList.size()) {
      if (id.equals(contactList.get(index).getContactId())) {
        return contactList.get(index);
      }
      index++;
    }
    throw new Exception("The Task does not exist!");
  }
}