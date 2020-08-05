package Students;
import java.util.Date;
import java.util.Calendar;
//The imports needed to allow the below class to function correctly without error.
public class SmartCard {
	/*instance variables - the different attributes of a smart card. These include the expiry date 
	 * the issue date and the student created from the student class.
	*/   
    private Student student;
    private Date issueDate;
    private Date expiryDate;
//The constructor for the class smart card.
    public SmartCard(String id, Student student) {
        this.student = student;
     
    }
 //The method used to get the students name.   
    public String getStudentName() { 
    	return student.getFirstName() + " " + student.getLastName(); 
    	}
 //The method used to get the students date of birth   
    public Date getDATE_OF_BIRTH() {
    	return student.getDATE_OF_BIRTH();
    }
 // The method used to get the Students ID   
    public StudentID getStudentID() { 
    	return getStudentID(); 
    	}
 //The method used to get the Issue date  
    public Date getIssueDate() {
    	return issueDate; 
    	}
 //The method used to get the Expiry date which is altered from the code in the Student class.   
    public void setExpiryDate (String studentType) throws Exception
    {
 //This for the undergraduate expiry date.
    	if (studentType.equals("Undergraduate"))
         {
             Calendar calendar = Calendar.getInstance();
             calendar.setTime(new Date());
             calendar.add(Calendar.YEAR, 4);
             calendar.getTime();
             expiryDate = calendar.getTime();
            }
//This is for the postgraduate taught expiry date. 
    	else if (studentType.equals("Postgraduate Taught"))
    	{
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.add(Calendar.YEAR, 2);
                calendar.getTime();
                expiryDate = calendar.getTime();
            }
////This is for the postgraduate research expiry date.     	
            else if (studentType.equals("Postgraduate Research"))
            {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.add(Calendar.YEAR, 5);
                calendar.getTime();
                expiryDate = calendar.getTime();
            }
    }
//This the method to get the expiry date.    
    public Date getExpiryDate() { 
    	return expiryDate;
    }
   
}
    