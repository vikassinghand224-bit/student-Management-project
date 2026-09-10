package src;

import java.util.List;

public enum Course {

    BTECH(List.of("CSE", "ECE", "ME", "CIVIL")),
    BCA(List.of("Computer Applications")),
    MCA(List.of("Computer Applications")),
    DIPLOMA(List.of("CSE", "ECE", "ME", "CIVIL"));

    private final List<String> branches;

    Course(List<String> branches) {
        this.branches = branches;
    }

    public List<String> getBranches() {
        return branches;
    }

    
    public boolean hasBranch(String branch) {
        return branches.stream()
                .anyMatch(b -> b.equalsIgnoreCase(branch));
    }
}