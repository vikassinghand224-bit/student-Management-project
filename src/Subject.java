package src;

public class Subject {
    private String subjectName;
    private String subjectCode;
    private int semester;
    private CourseAndSemester course;

    public Subject(String subjectName, String subjectCode, int semester, CourseAndSemester course) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.semester = semester;
        this.course = course;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public int getSemester() {
        return semester;
    }

    public CourseAndSemester getCourse() {
        return course;
    }

    
}
