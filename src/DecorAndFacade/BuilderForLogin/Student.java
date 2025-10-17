package DecorAndFacade.BuilderForLogin;

public class Student {
    private String username;
    private int password;
    private int course;
    private String enrolledCourse;
    private String supports;
    private int grade;
    private boolean hasGamification;
    private int attendees;
    private String courseConclusion;

    public void setCourseConclusion(String conclusion) {
        this.courseConclusion = conclusion;
    }

    public String getCourseConclusion() {
        return courseConclusion;
    }

    public Student(String username, int password, int course) {
        this.username = username;
        this.password = password;
        this.course = course;
        this.attendees = 0;
        this.grade = 0;
    }

    public String getUsername() { return username; }
    public int getPassword() { return password; }
    public int getCourse() { return course; }
    public void setSupported(String supports) { this.supports = supports; }
    public String getSupported() { return supports; }
    public void setEnrolledCourse(String c) { this.enrolledCourse = c; }
    public String getEnrolledCourse() { return enrolledCourse; }
    public void setGrade(int grade) { this.grade = grade; }
    public int getGrade() { return grade; }

    public void setHasGamification(boolean has) { this.hasGamification = has; }
    public boolean hasGamification() { return hasGamification; }
    public void addAttendee() { attendees++; }
    public int getAttendees() { return attendees; }

    @Override
    public String toString() {
        return "Student " + username +", course "+ course;
    }
}