package OOpsDesignPrinciple;
import java.util.*;

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

class CourseU {
    String courseName;
    Professor professor;
    List<StudentU> students = new ArrayList<>();

    CourseU(String courseName) { this.courseName = courseName; }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + courseName);
    }

    void enrollStudent(StudentU s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + courseName);
    }
}

class StudentU {
    String name;
    StudentU(String name) { this.name = name; }

    void enrollCourse(CourseU c) { c.enrollStudent(this); }
}

public class UnimgtTest {
    public static void main(String[] args) {
        Professor p = new Professor("Dr. Mehta");
        CourseU c = new CourseU("Data Structures");

        StudentU s1 = new StudentU("Ravi");
        StudentU s2 = new StudentU("Neha");

        c.assignProfessor(p);
        s1.enrollCourse(c);
        s2.enrollCourse(c);
    }
}
