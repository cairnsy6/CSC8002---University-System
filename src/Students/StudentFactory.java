package Students;
//The imports needed to allow the below class to function correctly without error.
import java.util.Date;
import java.util.Map;
import java.util.Calendar;

//The factory class the implements the interface studentProvider
//Along with the instance variables that constitute two Maps to organize what the methods below produce. 
final class StudentFactory implements StudentProvider  {
	
	private Map<StudentID, Student> students;
	private Map<String, Integer> smartCardIDCount;
 //Method to make a student ID from scratch   
    public StudentID makeStudentID() {
        char highestChar = 'a';
        int highestNum = 0;
        
        for (StudentID id: students.keySet()) {
            if (id.getCode() > highestChar) {
                highestChar = id.getCode();
            }    
        }
        
        // 
        
        for (StudentID id: students.keySet()) {
            if (id.getCode() != highestChar)
                continue;
                
            if (id.getNumber() > highestNum) {
                highestNum = id.getNumber();
            }
        }
        
 
        StudentID id = null;
        if (highestNum < 9999) {
            id = new StudentID(highestChar, highestNum + 1);
        } else {
            // 'b' == 'a' + 1
             id = new StudentID((char)((int)highestChar + 1), 1);
        }
    	return id;
    }
//Method to make a Smart Card ID from scratch using the parameters set forth in the courswork.
    public String makeSmartCardID(Student student, Date LocalDate) {
        String firstName = student.getFirstName();
        String lastName = student.getLastName();
 //The initial are produced by taking the first part of the string in first name and last name and changing them to upper case.      
    	String initials = firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase();
    	
    	Calendar cal = Calendar.getInstance();
        cal.setTime(LocalDate);
        int year = cal.get(Calendar.YEAR);
//The firstHalf helps organize the method and produces roughly two thirds of the smart card.        
        String firstHalf = initials + "-" + year;
        
        if (smartCardIDCount.keySet().contains(firstHalf)) {
            Integer numMade = smartCardIDCount.get(firstHalf);

            String digitStr = "";
            if (numMade < 10) digitStr = "0"+numMade;
            else digitStr = numMade.toString();
            
            smartCardIDCount.put(firstHalf, numMade + 1);
            
            firstHalf += "-" + digitStr;
            return firstHalf;
        } else {
            smartCardIDCount.put(firstHalf, 1);
            firstHalf += "-00";
            return firstHalf;
        }
    }
}
	

	

	