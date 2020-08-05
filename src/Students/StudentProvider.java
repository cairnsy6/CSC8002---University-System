package Students;
//The imports needed to allow the below class to function correctly without error.
import java.util.Date;

//The interface with the methods to make a new student ID and SmartCard ID
public interface StudentProvider {
	StudentID makeStudentID();
    String makeSmartCardID(Student student, Date LocalDate);
}
