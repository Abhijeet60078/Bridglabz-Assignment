package OOpsDesignPrinciple;
import java.util.*;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
    void show() { System.out.println("Faculty: " + name); }
}

class DepartmentU {
    String deptName;
    DepartmentU(String deptName) { this.deptName = deptName; }
    void show() { System.out.println("Department: " + deptName); }
}

class University {
    String uniName;
    List<DepartmentU> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String uniName) { this.uniName = uniName; }

    void addDepartment(DepartmentU d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }

    void showUniversity() {
        System.out.println("University: " + uniName);
        for (DepartmentU d : departments) d.show();
        for (Faculty f : faculties) f.show();
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        University u = new University("MIT");
        u.addDepartment(new DepartmentU("Computer Science"));
        u.addDepartment(new DepartmentU("Physics"));

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Watson");
        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showUniversity();
        // if University deleted, departments also vanish
        // but faculty can exist outside
    }
}
