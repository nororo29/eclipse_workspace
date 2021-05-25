package java_basic_day9;

public class Student {
    int studentId;
    String studentName;
    int grade;
    private String address;
    int score;
    
    
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
    
    public String showStudentInfo() {
    	String info = studentName + "/" + studentId + "/" + address;
    	return info;
    }
    
    public void println() {
    	String info = studentName + "/" + studentId + "/" + address;
    	System.out.println(info);
    }
    
    public String setScore(int s) {
    	score = s;
    	String info = showStudentInfo();
    	
    	return info + "/" + score;
    }
    
}
