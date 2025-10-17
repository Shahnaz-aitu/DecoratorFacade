package DecorAndFacade.BuilderForLogin;
public interface Builder {
    String setUsername(String username);
    int setPassword(int password);
    int setCourse(int course);

    Student build();
}
