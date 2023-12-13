/******************************************************************************
Write a java program to get the sorted results based on the marks 
percentage(upto 2 decimal places) of different departments of a student.

Sample Object{
“studentName” : “xyz”,
“percentage  “ : 50.22,    
“department” : “BFS”
}

*******************************************************************************/
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class Student{
    String studentName;
    double percentage;
    String department;
    
    public Student(String studentName,double percentage,String department)
    {
        this.studentName=studentName;
        this.percentage=percentage;
        this.department=department;
    }
    public String toString()
    {
        return "Student Name:"+studentName+" Department: "+department+" percentage: "+percentage;
    }
    public double getPercentage()
    {
        return percentage;
    }
}
public class StudentSort
{
	public static void main(String[] args) {
	    List<Student> student=new ArrayList<>();
	    student.add(new Student("Abishek",90.55,"ECE"));
	    student.add(new Student("Himadri",80.45,"CSE"));
	    student.add(new Student("Vishal",89.35,"ME"));
	    student.add(new Student("Shekhar",80.95,"CE"));
	    student.add(new Student("Naveen",98.65,"ECE"));
	    Collections.sort(student,Comparator.comparingDouble(Student::getPercentage).reversed());
	    
	    for(Student s:student)
	    {
	        System.out.println(s);
	    }
		
	}
}
