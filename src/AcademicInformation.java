package src;

public class AcademicInformation {
    private String studentId;
    private int addmissionYear;
    private CourseAndSemester course;
    private int yearOfStudy;
    private String collegeEmail;
    


    public AcademicInformation(String studentId, int addmissionYear, CourseAndSemester courseAndSemester, int yearOfStudy, String collegeEmail) {
        this.studentId = studentId;
        this.addmissionYear = addmissionYear;
        this.course = courseAndSemester;
        this.yearOfStudy = yearOfStudy;
        this.collegeEmail = collegeEmail;
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

    public String getCollegeEmail() {
        return collegeEmail;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }
}
