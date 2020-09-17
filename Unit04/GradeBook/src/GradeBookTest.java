/**
 * Created by Osama Halabi on 2020/09/17.
 */
public class GradeBookTest {
    public static void main(String[] args) {
        Course JavaCourse = new Course("CMPS 251", "Object-Oriented Programming");
        GradeBook JavaGradebook = new GradeBook(JavaCourse);
        //add students to Java course
        JavaGradebook.addStudent(new Student(111, "Ali", "Alali", 88) );
        JavaGradebook.addStudent(new Student(222, "Mohamed", "Abbas", 55) );
        JavaGradebook.addStudent(new Student(333, "Yazan", "Hajar", 91) );
        JavaGradebook.addStudent(new Student(444, "Omar", "Alkashef", 79) );
        JavaGradebook.addStudent(new Student(555, "Mohamed", "Taher", 93) );
        JavaGradebook.displayGrades();
        System.out.printf("Average Grade: %.2f %n", JavaGradebook.getAverage());
        System.out.printf("Maximum Grade: %.2f %n", JavaGradebook.getMaxGrade());
        System.out.printf("Minimum Grade: %.2f %n", JavaGradebook.getMinGrade());
    }
}
