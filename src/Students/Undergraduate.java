package Students;

//The imports needed to allow the below class to function correctly without error.
import java.util.ArrayList;
import java.util.Date;

//The class for undergraduate students that inherits from the student class
//The instance variables that make up the class including the array list containing the modules available.

public class Undergraduate extends Student {
	private ArrayList<Modules> Schedule = new ArrayList<Modules>();
	private final String STUDENT_TYPE;
	
//The constructor for the class which shows the inheritance of the first and last name and dob from the student class
public Undergraduate(String fName, String lName, Date dOBirth) {
		super(fName, lName, dOBirth);
		this.STUDENT_TYPE = "Undergraduate";
		}
//The method to get the student type	
public String getSTUDENT_TYPE() {
		return STUDENT_TYPE;
	}
	
//The method to check if the student is assigned to enough modules    
public void isStudentEnrolledFully() {
		int totalCredits = 0;
		for(Modules numberOfCredits: Schedule)
			totalCredits += numberOfCredits.getNumberOfCredits();
		if(totalCredits > 120) {
			System.out.println("The student still doesn't have a full courseload");}
		else if(totalCredits == 120) {
		
			System.out.println("The student is registered and has a full courseload");}
			
		else{	System.out.println("The student currently has too many classes and needs to remove one or more");
			
		}
	
	}

//The method to check if the student has passed the module. 
public void hasStudentPassed(int moduleMark) {
		if (moduleMark > 40) {
			System.out.println("The student has not passed the module");
		}
		else if(moduleMark>=40){
			System.out.println("Congratulations you have passed the module");
		}
	}
}
	



	
	

