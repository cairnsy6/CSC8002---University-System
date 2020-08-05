//Produced 03/19/2019
//Author @ Rhys Cairns

// The package used for this particular coursework.
package Students;

//The imports needed to allow the below class to function correctly without error.
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;
import java.time.Period;
import java.util.Calendar;

/*instance variables - the different attributes of a student made up of an ArrayList so that the student
* created can add the modules that it will be studying from the ones already created.
* It also includes the students first name, last name and date of birth.
*/
public class Student {
	
	private ArrayList<Modules> Schedule = new ArrayList<Modules>();
	private final String FIRST_NAME;
	private final String LAST_NAME;
	private final Date DATE_OF_BIRTH;
/*The constructor of objects for the class Student
 * These include the first name,
 * the last name,
 * and the date of birth.
 */
public Student(String fName, String lName, Date dob)
{
	this.FIRST_NAME = fName;
	this.LAST_NAME = lName;
	this.DATE_OF_BIRTH = dob;

	
}
//The method to get the first name of the student
public String getFirstName() {
	return FIRST_NAME;
}
//The method to get the last name of the student
public String getLastName() {
	return LAST_NAME;
}
//The method to get the date of birth of the student
public Date getDATE_OF_BIRTH() {
	return DATE_OF_BIRTH;
}
// The toString method to produce the full name of the student
public String toString() {
	return(this.FIRST_NAME+" "+this.LAST_NAME);
}
//The method to add the modules to the student to create the students schedule
public void addModules(Modules m) {
	Schedule.add(m);	
}
//The method to remove the modules from the student if they finish or drop any classes
public void removeModule(Modules m) {
	Schedule.remove(m);
	
}
//The method to return the whole schedule of the student
public ArrayList<Modules> getSchedule() {
	return Schedule;
}
//The method to set the student ID from students
public void setID(StudentID studentID) {
}

//The method to get the Age of the Student to determine what type of student they are, or even of age to be a student.
//Part of the code is taken from Dan's clinic and part from 
//https://www.candidjava.com/tutorial/java-program-to-calculate-age-from-date-of-birth/
public int getAgeOfStudent(Date dOBirth) {
		
    Calendar cal = Calendar.getInstance();
    cal.setTime(dOBirth);
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH) + 1;
    int date = cal.get(Calendar.DATE);
    LocalDate studentDateOfBirth = LocalDate.of(year, month, date);
    LocalDate currentDate = LocalDate.now();
    Period dateDifference = Period.between(studentDateOfBirth, currentDate);
    return dateDifference.getYears();
}
}
