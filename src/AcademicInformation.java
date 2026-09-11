package src;

public class AcademicInformation {
    private int addmissionYear;
    private CourseAndSemester course;

    public AcademicInformation(int addmissionYear, CourseAndSemester courseAndSemester) {
        this.addmissionYear = addmissionYear;
        this.course = courseAndSemester;
    }

    public int getAddmissionYear() {
        return addmissionYear;
    }

    public CourseAndSemester getCourse() {
        return course;
    }
}
