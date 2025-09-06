package Constructor;


class Student {
    public int rollNumber;        // public
    protected String name;        // protected
    private double CGPA;          // private

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }


    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}


class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name +
                ", Specialization: " + specialization +
                ", CGPA: " + getCGPA());
    }
}
