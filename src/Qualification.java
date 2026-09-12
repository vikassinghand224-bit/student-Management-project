package src;

public enum Qualification {

    HIGH_SCHOOL("High School"),
    TWELFTH("12th"),
    DIPLOMA("Diploma"),
    BACHELOR("Bachelor"),
    MASTER("Master"),
    DOCTORATE("Doctorate");

    private final String qualification;

    Qualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public static Qualification fromString(String qualification) {
        for (Qualification q : Qualification.values()) {
            if (q.getQualification().equalsIgnoreCase(qualification)) {
                return q;
            }
        }
        throw new IllegalArgumentException("Invalid qualification: " + qualification);
    }

    
}
