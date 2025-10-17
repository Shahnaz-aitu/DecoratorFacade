package DecorAndFacade.BuilderForLogin;

public class StudentBuilder implements Builder {
    private String username;
    private int password;
    private int course;

    @Override
    public String setUsername(String username) { this.username = username; return username; }

    @Override
    public int setPassword(int password) { this.password = password; return password; }

    @Override
    public int setCourse(int course) { this.course = course; return course; }

    @Override
    public Student build() {
        return new Student(username, password, course);
    }
}
