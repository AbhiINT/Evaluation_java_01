import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    String name;
    double marks;
    String department;

    public Student(String name, double marks, String department) {
        this.name = name;
        this.marks = marks;
        this.department = department;
    }
}

public class GetHighestMarksDepartment {
    public static void setMapValueMax( Map<String, Map.Entry<String, Double>> marksMapDep,Student std)
    {
        String department = std.department;
        double marks = std.marks;
        String name = std.name;

        if (marksMapDep.containsKey(department)) {
            Map.Entry<String, Double> currentEntry = marksMapDep.get(department);
            if (marks > currentEntry.getValue()) {
                marksMapDep.put(department, Map.entry(name, marks));
            }
        } else {
            marksMapDep.put(department, Map.entry(name, marks));
        }
    }
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("Abishek",91.55,"JAVA"));
        student.add(new Student("Himad",84.45,"JAVA"));
        student.add(new Student("Vis",89.35,"PYTHON"));
        student.add(new Student("Shekhar",80.95,"JAVASCRIPT"));
        student.add(new Student("Naveen",90.65,"JAVASCRIPT"));
        student.add(new Student("Abishek",90.55,"JAVASCRIPT"));
        student.add(new Student("Rahul",99.45,"PYTHON"));
        student.add(new Student("Vis",89.35,"JAVA"));
        student.add(new Student("Shekharaaaa",80.95,"JAVASCRIPT"));
        student.add(new Student("Naveen",78.65,"JAVA"));
        student.add(new Student("Abishek",60.55,"PYTHON"));
        student.add(new Student("Himad",80.45,"PYTHON"));
        student.add(new Student("Vis",79.35,"JAVA"));
        student.add(new Student("Raj",80.95,"JAVASCRIPT"));
        student.add(new Student("Damodar",92.65,"PYTHON"));


        Map<String, Map.Entry<String, Double>> marksMapDep = new HashMap<>();


        for (Student std : student) {
            setMapValueMax(marksMapDep,std);
        }


        for (Map.Entry<String, Map.Entry<String, Double>> entry : marksMapDep.entrySet()) {
            System.out.println("Department: " + entry.getKey() +
                    ", Highest Marks: " + entry.getValue().getValue() +
                    ", Student Name: " + entry.getValue().getKey());
        }
    }
}