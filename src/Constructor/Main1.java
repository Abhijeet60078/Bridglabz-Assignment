package Constructor;

public class Main1{
    public static void main(String[] args) {

        Course c1 = new Course("Java Programming", 6, 15000.0);
        Course c2 = new Course("Web Development", 4, 12000.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();


        Course.updateInstituteName("Tech Academy");


        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
