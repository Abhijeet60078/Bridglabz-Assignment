package OOpsDesignPrinciple;

import java.util.*;

class Course {
    String courseName;
    List<Student> students = new ArrayList<>();

    Course(String courseName) { this.courseName = courseName; }

    void enrollStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) System.out.println(" - " + s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) { this.name = name; }

    void enroll(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) System.out.println(" - " + c.courseName);
    }
}

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();

    School(String schoolName) { this.schoolName = schoolName; }

    void addStudent(Student s) { students.add(s); }

    void showSchool() {
        System.out.println("School: " + schoolName);
        for (Student s : students) System.out.println(" - " + s.name);
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("Ankit");
        Student s2 = new Student("Meera");

        Course c1 = new Course("Maths");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s2.enroll(c1);
        s1.enroll(c2);

        school.showSchool();
        s1.showCourses();
        c1.showStudents();
    }
}
