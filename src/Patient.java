import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {

	private int idNumber;
	private RodoForm rodoForm;
	public static List<Patient> patientList;
	private static int idCounter = 0;
	
	public Patient(String name, String surname, String pesel, String telephone, String email, String street,
			String city, String postalCode, String country) {
		super(name, surname, pesel, telephone, email, street, city, postalCode, country);
		this.idNumber = generateIdNumber();
		this.rodoForm = generateRodoForm();
		addPatientToPatientList(this);
	}

	private void addPatientToPatientList(Patient pacjent) {
		if(patientList == null) {
			patientList = new ArrayList<Patient>();
		}else {
			patientList.add(pacjent);
		}
	}

	private RodoForm generateRodoForm() {
		
		return null;
	}

	private int generateIdNumber() {
		idCounter+=idCounter+1;
		return idCounter;
	}


	

}
