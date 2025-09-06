package Constructor;


class Employee {
    public int employeeID;       // public
    protected String department; // protected
    private double salary;       // private

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeID + ", Department: " + department +
                ", Salary: ₹" + getSalary() + ", Team Size: " + teamSize);
    }
}
