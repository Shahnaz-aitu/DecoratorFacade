package DecorAndFacade;
import java.util.Scanner;

public class Application {
    StudentPortalFacade personChoice= new StudentPortalFacade();
    Scanner scanner = new Scanner(System.in);

    String name=new StudentPortalFacade().logIn();

    public void task() {
        while (name.equals("")) {
            System.out.println("Please enter your name");
        }
           while (true){
            System.out.println("Write action: (enroll in course)(start learning)(complete course)");
            String action = scanner.nextLine().toLowerCase();
            switch (action) {
                case "enroll in course":
                    System.out.println(personChoice.enrollInCourse());
                    break;
                case "start learning":
                    System.out.println(personChoice.startLearning());
                    break;
                case "complete course":
                    System.out.println(personChoice.completeCourse());
                    break;
                case "exit":
                    System.out.println("👋 Goodbye!");
                    return;
            }
        }
    }
}
