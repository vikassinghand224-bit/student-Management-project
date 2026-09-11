package src;

public class AcademicInformation {
    private String studentId;
    private int addmissionYear;
    private CourseAndSemester course;
    

    public AcademicInformation(String studentId, int addmissionYear, CourseAndSemester courseAndSemester) {
        this.studentId = studentId;
        this.addmissionYear = addmissionYear;
        this.course = courseAndSemester;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getAddmissionYear() {
        return addmissionYear;
    }

    public CourseAndSemester getCourse() {
        return course;
    }
}
