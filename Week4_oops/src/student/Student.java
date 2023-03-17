package student;

public class Student {
	int rollNumber;
	String name, course;
	float marks1, marks2, marks3,avg;
	public Student(int rollNumber, String name, String course, float marks1, float marks2, float marks3) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getMarks1() {
		return marks1;
	}
	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}
	public float getMarks2() {
		return marks2;
	}
	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}
	public float getMarks3() {
		return marks3;
	}
	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}
	public float Total() {
	return(marks1+ marks2+ marks3);
		}
    public double Average() {
    	avg=(marks1+ marks2+ marks3)/3;
    	return(avg);
    }
    public String Grade() {
    	if(avg>65)
    		return("First");
    	else if(avg>55 && avg<=55)
    		return("Second");
    	else
    		return("Third");
    }
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + ", marks1=" + marks1
				+ ", marks2=" + marks2 + ", marks3=" + marks3 + "]";
	}
}