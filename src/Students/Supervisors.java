package Students;
import java.util.ArrayList;


public class Supervisors {
	
	private static String SUPERVISOR_NAME;
	private static ArrayList<Modules>Schedule = new ArrayList<Modules>();
	
	
public Supervisors(String S_N) {
	Supervisors.SUPERVISOR_NAME = S_N;
	
}


public String getSUPERVISOR_NAME(String S_N) {
	return SUPERVISOR_NAME;
}

public static void add(Supervisors s) {
	Supervisors.add(s);
	
}


public static Object getSupervisors() {
	// TODO Auto-generated method stub
	return (SUPERVISOR_NAME + Schedule);
}

}
