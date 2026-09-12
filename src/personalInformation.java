package src;

public class PersonalInformation {
    private String name;
    private String dob;
    private Gender gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String fatherName;
    private int fatherPhoneNumber;
    private Qualification qualification;

    public PersonalInformation(String name, String dob, Gender gender, String address, String phoneNumber, String email, String fatherName, int fatherPhoneNumber, Qualification qualification) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.fatherName = fatherName;
        this.fatherPhoneNumber = fatherPhoneNumber;
        this.qualification = qualification;
    }
}
