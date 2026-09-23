package src;

import java.util.List;

public enum CourseAndSemester {

    BTECH(List.of("CSE", "ECE", "ME", "CIVIL"),8),
    BCA(List.of("Computer Applications"),6),
    MCA(List.of("Computer Applications"),6),
    DIPLOMA(List.of("CSE", "ECE", "ME", "CIVIL"),6);


    private final List<String> Branches;
    private final int Semesters;

    CourseAndSemester(List<String> branches, int semesters) {
        this.Branches = branches;
        this.Semesters = semesters;
    }

    public List<String> getBranches() {
        return Branches;
    }
    public int getSemesters() {
        return Semesters;
    }

    
    public boolean hasBranch(String branch) {
        return Branches.stream()
                .anyMatch(b -> b.equalsIgnoreCase(branch));

    }
    public boolean hasSemester(int semester) {
        return semester >= 1 && semester <= Semesters;
    }
}