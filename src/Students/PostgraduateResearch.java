package Students;
//The imports needed to allow the below class to function correctly without error.
import java.util.ArrayList;
import java.util.Date;
//The class for postgraduate research students that inherits from the student class
//The instance variables that make up the class including the array list containing the supervisors available.
public class PostgraduateResearch extends Student {
	
	private ArrayList<Supervisors>Supervisor = new ArrayList<Supervisors>();
	private final String STUDENT_TYPE;

//The constructor for the class which shows the inheritance of the first and last name and dob from the student class	     
public PostgraduateResearch(String fName, String lName, Date dOBirth) {
		super(fName, lName, dOBirth);
		this.STUDENT_TYPE = "Postgraduate Research";
	}

//The method for getting the student type
public String getPostgraduateResearch() {
	return STUDENT_TYPE;
}
//The method for getting adding the supervisor to the student, if no supervisor has been assigned.
	public void addSupervisor(Supervisors s) {
	if(Supervisors.getSupervisors() == null) {
		this.Supervisor.add(s);}
		else {
			System.out.println("Sorry but a supervisor has already been assigned to this student");
	}
	}
    
	}

