package src;

public class Marks {
    private String studentId;
    private String subjectCode;
    private int marks;
    

    public Marks(String studentId, String subjectCode, int marks) {
        this.studentId = studentId;
        this.subjectCode = subjectCode;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public int getMarks() {
        return marks;
    }
    
}
