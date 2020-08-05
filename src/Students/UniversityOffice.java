package Students;
//The imports needed to allow the below class to function correctly without error.
import java.util.HashMap;

//Instance variables of the university office class. A hashMap is created and a student factory so that the below methods can be implemented.
public class UniversityOffice {
	HashMap<StudentID,Student> map = new HashMap<>();
    StudentFactory factory = new StudentFactory();
    
//Method for finding out the number of students based on their type.
public int noOfStudents(StudentType type) {
        int s = 0;

        switch (type) {
            case Undergraduate:
                for (Student stu: map.values()) 
                    if (stu instanceof Undergraduate)
                        s++;
                break;
            case PostgraduateTaught:
                for (Student stu: map.values()) 
                    if (stu instanceof PostgraduateTaught)
                    	s++;
                break;
            case PostgraduateResearch:
                for(Student stu: map.values()) 
                    if (stu instanceof PostgraduateTaught)
                        s++;
                break;
                
            default:
                break;
        }
        
        return s;
    }
//Method used to register a student and assign them with a new id
public void registerStudent (Student student) {
    StudentID id = factory.makeStudentID();
    student.setID(id);
    map.put(id, student);
} 
//Method used to amend student data which is determined on the studentID
public void amendStudentData(StudentID studentID, Student studentData) {
    map.put(studentID, studentData);
}
//Method used to terminate the student by removing the studentID
public void terminate(StudentID id) {
    map.remove(id);
}
}
