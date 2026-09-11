package src;



public class Student {
    private PersonalInformation personalInfo;
    private AcademicInformation academicInfo;
    


    public Student(PersonalInformation personalInfo, AcademicInformation academicInfo) {
        this.personalInfo = personalInfo;
        this.academicInfo = academicInfo;
        
    }
     

    public PersonalInformation getPersonalInfo() {
        return personalInfo;
    }

    public AcademicInformation getAcademicInfo() {
        return academicInfo;
    }
    
}
