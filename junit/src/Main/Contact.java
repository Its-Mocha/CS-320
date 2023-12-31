package Main;




public class Contact {

	  private static final int CONTACT_PHONENUM_LENGTH = 10;
	  
	  private static final byte CONTACT_FNAME_LENGTH = 10;
	  private static final byte CONTACT_LNAME_LENGTH = 10;
	  private static final byte CONTACT_ADDRESS_LENGTH = 30;
	
	  private String contactId;
	  private String firstName;
	  private String lastName;
	  private String phoneNumber;
	  private String address;


	  public Contact(String Id, String firstName, String lastName,
	          String phoneNumber, String address) {
	    contactId = Id;
	    updateFirstName(firstName);
	    updateLastName(lastName);
	    updatePhoneNumber(phoneNumber);
	    updateAddress(address);
	  }

	  public final String getContactId() { return contactId; }

	  public final String getFirstName() { return firstName; }
	 
	  public final String getLastName() { return lastName; }

	  public final String getPhoneNumber() { return phoneNumber; }

	  public final String getAddress() { return address; }

	  public void updateFirstName(String firstName) {
	    if (firstName == null) {
	      throw new IllegalArgumentException("First name cannot be empty");
	    } else if (firstName.length() > CONTACT_FNAME_LENGTH) {
	      throw new IllegalArgumentException("First name cannot be longer than " +
	                                         CONTACT_FNAME_LENGTH + " characters");
	    } else {
	      this.firstName = firstName;
	    }
	  }

	  public void updateLastName(String lastName) {
	    if (lastName == null) {
	      throw new IllegalArgumentException("Last name cannot be empty");
	    } else if (lastName.length() > CONTACT_LNAME_LENGTH) {
	      throw new IllegalArgumentException("Last name cannot be longer than " +
	                                         CONTACT_LNAME_LENGTH + " characters");
	    } else {
	      this.lastName = lastName;
	    }
	  }

	  public void updatePhoneNumber(String phoneNumber) {
	    String regex = "[0-9]+";
	    if (phoneNumber == null) {
	      throw new IllegalArgumentException("Phone number cannot be empty.");
	    } else if (phoneNumber.length() != CONTACT_PHONENUM_LENGTH) {
	      throw new IllegalArgumentException(
	          "Phone number length invalid. Ensure it is " +
	          CONTACT_PHONENUM_LENGTH + " digits.");
	    } else if (!phoneNumber.matches(regex)) {
	      throw new IllegalArgumentException(
	          "Phone number cannot have anything but numbers");
	    } else {
	      this.phoneNumber = phoneNumber;
	    }
	  }

	  public void updateAddress(String address) {
	    if (address == null) {
	      throw new IllegalArgumentException("Address cannot be empty");
	    } else if (address.length() > CONTACT_ADDRESS_LENGTH) {
	      throw new IllegalArgumentException("Address cannot be longer than " +
	                                         CONTACT_ADDRESS_LENGTH +
	                                         " characters");
	    } else {
	      this.address = address;
	    }
	  }
	}	