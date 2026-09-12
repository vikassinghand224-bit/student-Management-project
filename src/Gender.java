package src;

public enum Gender {
    MALE, FEMALE, OTHER;

    public static Gender fromString(String gender) {
        for (Gender g : Gender.values()) {
            if (g.name().equalsIgnoreCase(gender)) {
                return g;
            }
        }
        throw new IllegalArgumentException("Invalid gender: " + gender);
    }
}
