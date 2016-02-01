package Information;

public enum  Courses {
    CSCI_12700("CSCI 127"),
    CSCI_13500("CSCI 135"),
    CSCI_13600("CSCI 136"),
    CSCI_15000("CSCI 150"),
    CSCI_16000("CSCI 160"),
    CSCI_23500("CSCI 235");

    private String name;

    Courses(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Courses getCourse(String courseName) {
        for (Courses course : Courses.values()) {
            if (courseName.equals(course.toString())) {
                return course;
            }
        }

        throw new IllegalArgumentException(courseName + " is not a valid course");
    }
}