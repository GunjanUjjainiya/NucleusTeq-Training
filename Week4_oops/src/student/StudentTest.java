package student;


import java.util.Arrays;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
	 Student s1=new Student(101,"Aayush Tiwari","Science",96,85,55);
	 Student s2=new Student(102,"Anuradha Saini","Maths",86,25,65);
	 Student s3=new Student(103,"Abhishek Sharma","Science",76,45,45);
	 Student s4=new Student(104,"Rohit Rajput","Commerce",86,35,15);
	 Student s5=new Student(105,"Shruti Tiwari","Arts",46,85,55);
	 List<Student> al= Arrays.asList(s1,s2,s3,s4,s5);
		
		
		for(Student student:al) {
			System.out.println(student);
			System.out.println(student.Total());
			System.out.println(student.Average());
			System.out.println(student.Grade());
		}

		
	}

}
