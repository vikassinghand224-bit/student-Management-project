package src;

public class Attendence {
    private String studentId;
    private String subjectCode;
    private int totalClasses;
    private int attendedClasses;

     public Attendence(String studentId, String subjectCode, int totalClasses, int attendedClasses) {
        this.studentId = studentId;
        this.subjectCode = subjectCode;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;


        
    }
    public String getStudentId() {
        return studentId;
    }
    public String getSubjectCode() {
        return subjectCode;
    }
    public int getTotalClasses() {
        return totalClasses;
    }
    public int getAttendedClasses() {
        return attendedClasses;
    }
    public double getAttendancePercentage() {
        if (totalClasses == 0) {
            return 0.0;
        }
        return (attendedClasses / (double) totalClasses) * 100;
    }

}