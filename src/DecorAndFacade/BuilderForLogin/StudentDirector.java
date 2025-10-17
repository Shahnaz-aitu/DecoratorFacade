package DecorAndFacade.BuilderForLogin;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDirector {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> students = new ArrayList<>();
    private Student currentStudent;

    public Student login() {
        System.out.println("Hello! Log in to the platform.\nWrite your name:");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Please enter your name");
            return null;
        }
         System.out.println("Write your password:");
         int password = scanner.nextInt();
         System.out.println("Write your course (1, 2, 3):");
         int course = scanner.nextInt();
         scanner.nextLine();

         StudentBuilder builder = new StudentBuilder();
         builder.setUsername(name);
         builder.setPassword(password);
         builder.setCourse(course);
         currentStudent = builder.build();
         students.add(currentStudent);
         System.out.println("Welcome, " + name + "!");
         return currentStudent;
    }

    public Student getCurrentStudent() {
        return currentStudent;
    }
}
