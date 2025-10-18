import DecorAndFacade.*;
import DecorAndFacade.BuilderForLogin.*;
import java.util.Scanner;
public class DemoMain {
    Scanner scanner = new Scanner(System.in);
    StudentDirector director = new StudentDirector();
    StudentPortalFacade portal = new StudentPortalFacade(director);

    public void run() {

        boolean running = true;

        while (running) {
            System.out.println("\nPlease choose action!");
            System.out.println("=== Log in ===");
            System.out.println("=== Enroll ===");
            System.out.println("=== Start learning ===");
            System.out.println("=== Complete course ===");
            System.out.println("=== Exit ===");
            String action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "log in":
                    System.out.println(director.login());
                    break;
                case "enroll":
                    System.out.println(portal.enrollInCourse());
                    break;
                case "start learning":
                    portal.startLearning();
                    break;
                case "complete course":
                    portal.completeCourse();
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command. Try again!");
            }
        }
    }
}