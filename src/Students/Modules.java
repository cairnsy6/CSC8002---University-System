package Students;
//The instance variables that make up the module class. Name, code, number of credits and module mark.
public class Modules {

	private String courseName;
	private String courseCode;
	private int numberOfCredits;
	private int moduleMark;

//The constructor for the object of the module class
public Modules (String cName, String cCode, int nOfCredits, int mMark) {
	this.courseName = cName;
	this.courseCode = cCode;
	this.numberOfCredits = nOfCredits;
	this.moduleMark = mMark;
}
	
//The method to get the course name
public String getCourseName(String cName) {
		return courseName;
	}

//The method to get the course code
	public String getCourseCode(String cCode) {
		return courseCode;
	}

//The method to get the number of credits
	public int getNumberOfCredits() {
		return numberOfCredits;
	}

//The method to get the module mark
	public int getModuleMark() {
		return moduleMark;
	}
	
	
	

}

