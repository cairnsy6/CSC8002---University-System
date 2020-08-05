package Students;
//The class for Student IDs
class StudentID {
	
	private char code;
	private int num;
	
    public StudentID(char code, int num) {
        this.code = code;
        this.num = num;
  
        }

	public char getCode() {
        return code;
        		}
    public int getNumber() {
        return num;
    }
    
    public String getStudentID(char code, int num) {
    return code +String.valueOf(num);}
    
  
}