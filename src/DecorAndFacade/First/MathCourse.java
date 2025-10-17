package DecorAndFacade.First;
import java.util.Scanner;

public class MathCourse implements Course {
    private Scanner scanner = new Scanner(System.in);
    private int grade = 0;
    private int attendance = 0;

    @Override
    public String deliverContent() {
        return "Math Course: Algebra, Geometry, and Calculus!";
    }

    @Override
    public void lesson1() {
        System.out.println("\nLesson 1: Algebra");
        System.out.println("Solve: 5x + 10 = 20. What is x?");
        String answer = scanner.nextLine();
        if (answer.equals("2")) {
            System.out.println("Correct!");
            grade++;
        } else {
            System.out.println("Wrong! x = 2");
        }
        attendance++;
    }

    @Override
    public void lesson2() {
        System.out.println("\nLesson 2: Geometry");
        System.out.println("A triangle has sides 3, 4, 5. What is its area?");
        String answer = scanner.nextLine();
        if (answer.equals("6")) {
            System.out.println("Correct!");
            grade++;
        } else {
            System.out.println("Wrong! Area = 6");
        }
        attendance++;
    }

    @Override
    public void lesson3() {
        System.out.println("\nLesson 3: Calculus");
        System.out.println("Find the derivative of x²:");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("2x")) {
            System.out.println("Correct!");
            grade++;
        } else {
            System.out.println("Wrong! The correct answer is 2x.");
        }
        attendance++;
    }

    @Override
    public void conclusion() {
        System.out.println("\nMath Course Summary:");
        System.out.println("Attendance: " + attendance + "/3 lessons");
        System.out.println("Score: " + grade + "/3 tasks");
        if (grade == 3) {
            System.out.println("Excellent! You passed Math Course!");
        } else if (grade >= 2) {
            System.out.println("Good job! You passed.");
        } else {
            System.out.println("You need more practice.");
        }
    }
}
