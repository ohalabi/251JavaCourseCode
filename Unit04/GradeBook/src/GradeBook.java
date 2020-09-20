import java.util.ArrayList;
import java.util.List;

/**
 * Created by Osama Halabi on 2020/09/17.
 */
public class GradeBook {
    private Course course;
    private List<Student> students; // stacked in this line

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }
    // add student
    void addStudent(Student student) {
        students.add(student);
    }

    // calculate average grade for the whole class
    public double getAverage () {
        double total = 0;
        for (var student: students) {
            total += student.getGrade();
        }
        return total / students.size();
    }

    // calculate max grade
    public double getMaxGrade () {
        double maxGrade = students.get(0).getGrade();//get grade for the first student in the list

        for (var student:students) {
            double grade = student.getGrade();
            if(grade > maxGrade){
                maxGrade = grade;
            }
        }
        return maxGrade;
    }

    // calculate min grade
    public double getMinGrade () {
        double minGrade = students.get(0).getGrade();//get grade for the first student in the list

        for (var student:students) {
            double grade = student.getGrade();
            if(grade < minGrade){
                minGrade = grade;
            }
        }
        return minGrade;
    }

    public void displayGrades () {
        System.out.printf("the grades for %s %s %n", course.getCode(), course.getName());
        System.out.println("ID \t First name \t Last name \t Grade");
        System.out.println("--\t ----------- \t --------- \t ------");
        // output each student's grade

        for (var student: students) {
            System.out.printf("%d \t %-6s \t %-5s \t %.2f%n", student.getId(),
                    student.getFirstname(), student.getLastname(), student.getGrade());
        }
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
