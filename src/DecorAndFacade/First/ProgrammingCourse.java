package DecorAndFacade.First;
import java.util.Scanner;

public class ProgrammingCourse implements Course {
    private Scanner scanner = new Scanner(System.in);
    private int grade = 0;
    private int attendance = 0;

    @Override
    public String deliverContent() {
        return "Programming Course: Java, OOP, and Algorithms!";
    }

    @Override
    public void lesson1() {
        System.out.println("\nLesson 1: Java Basics");
        System.out.println("Question: What keyword is used to define a class in Java?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("class")) {
            System.out.println("Correct!");
            grade++;
        } else {
            System.out.println("Wrong! The correct answer is 'class'.");
        }
        attendance++;
    }

    @Override
    public void lesson2() {
        System.out.println("\nLesson 2: OOP");
        System.out.println("Question: What are the four pillars of OOP?");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("inheritance") && answer.contains("polymorphism") &&
                answer.contains("encapsulation") && answer.contains("abstraction")) {
            System.out.println("Great! You know your OOP!");
            grade++;
        } else {
            System.out.println("Missed something. The correct ones are: Inheritance, Polymorphism, Encapsulation, Abstraction.");
        }
        attendance++;
    }

    @Override
    public void lesson3() {
        System.out.println("\nLesson 3: Algorithms");
        System.out.println("Question: What is the time complexity of binary search?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("O(log n)") || answer.equalsIgnoreCase("log n")) {
            System.out.println("Correct!");
            grade++;
        } else {
            System.out.println("The correct answer is O(log n).");
        }
        attendance++;
    }

    @Override
    public void conclusion() {
        System.out.println("\nProgramming Course Summary:");
        System.out.println("Attendance: " + attendance + "/3 lessons");
        System.out.println("Score: " + grade + "/3 tasks");
        if (grade == 3) {
            System.out.println("Excellent! You mastered Programming Course!");
        } else if (grade >= 2) {
            System.out.println("Good progress! Keep practicing.");
        } else {
            System.out.println("You need more coding practice.");
        }
    }
}
