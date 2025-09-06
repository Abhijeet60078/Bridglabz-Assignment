package Constructor;

public class Course {

    private String courseName;
    private int duration;   // in months
    private double fee;
    private static String instituteName = "Default Institute";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName +
                ", Course: " + courseName +
                ", Duration: " + duration + " months" +
                ", Fee: ₹" + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
