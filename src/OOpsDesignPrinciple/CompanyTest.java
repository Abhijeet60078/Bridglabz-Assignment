package OOpsDesignPrinciple;
import java.util.*;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
    void display() { System.out.println("Employee: " + name); }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDept() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) e.display();
    }
}

class Company {
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) d.showDept();
    }
}

public class CompanyTest {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Raj"));
        d1.addEmployee(new Employee("Simran"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Amit"));

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.showCompany();
        // if we delete company object 'c', departments and employees vanish too
    }
}
