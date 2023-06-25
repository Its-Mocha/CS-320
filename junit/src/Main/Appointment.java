package Main;

import java.util.Date;

public class Appointment {


  final private byte APPOINTMENT_DESCRIPTION_LENGTH;

  private String appointmentId;
  private Date appointmentDate;
  private String description;

  {
   
    APPOINTMENT_DESCRIPTION_LENGTH = 50;
  }

  public Appointment(String id, Date date, String description) {
	if (id.length()<10 )
		return; //throw new IllegalArgumentException("ID cannot be more then 10 characters.");
	else {
    appointmentId = id;
    updateDate(date);
    updateDescription(description);
  }
  }


  

  public String getAppointmentId() { return appointmentId; }

  public void updateDate(Date date) {
    if (date == null) {
      throw new IllegalArgumentException("Appointment date cannot be null.");
    } else if (date.before(new Date())) {
      throw new IllegalArgumentException(
          "Cannot make appointment in the past.");
    } else {
      this.appointmentDate = date;
    }
  }

  public Date getAppointmentDate() { return appointmentDate; }

  public void updateDescription(String description) {
    if (description == null) {
      throw new IllegalArgumentException(
          "Appointment description cannot be null.");
    } else if (description.length() > APPOINTMENT_DESCRIPTION_LENGTH) {
      throw new IllegalArgumentException(
          "Appointment description cannot exceed " +
          APPOINTMENT_DESCRIPTION_LENGTH + " characters.");
    } else {
      this.description = description;
    }
  }

  public String getDescription() { return description; }
}