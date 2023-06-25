package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class AppointmentService {
  final private List<Appointment> appointmentList = new ArrayList<>();

  public void newAppointment(String id, Date date, String description) {	
	    Appointment appt = new Appointment(newUniqueid(id), date, description);
	    appointmentList.add(appt);
	  }
  		
	public String newUniqueid(String id) {
	if (id.equals(appointmentList));
		return id;
	}
	

	public void deleteAppointment(String id) throws Exception {
	    appointmentList.remove(searchForAppointment(id));
	  }

	  public List<Appointment> getAppointmentList() { return appointmentList; }

	  public Appointment searchForAppointment(String id) throws Exception {
	    int index = 0;
	    while (index < appointmentList.size()) {
	      if (id.equals(appointmentList.get(index).getAppointmentId())) {
	        return appointmentList.get(index);
	      }
	      index++;
	    }
	    throw new Exception("The appointment does not exist!");
	  }
	}