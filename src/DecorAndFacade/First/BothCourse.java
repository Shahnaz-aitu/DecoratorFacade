package DecorAndFacade.First;

import java.util.Scanner;

public class BothCourse implements Course {
    private Scanner scanner = new Scanner(System.in);
    private int grade = 0;
    private int grade2 = 0;
    private int attendance = 0;
    @Override
    public String deliverContent() {
        return "Programming Course: Java, OOP, and Algorithms!\nMath Course: Algebra, Geometry, and Calculus!";
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

        System.out.println("\nLesson 1: Java Basics");
        System.out.println("Question: What keyword is used to define a class in Java?");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("class")) {
            System.out.println("Correct!");
            grade2++;
        } else {
            System.out.println("Wrong! The correct answer is 'class'.");
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
        System.out.println("\nLesson 2: OOP");
        System.out.println("Question: What are the four pillars of OOP?");
        String answer1 = scanner.nextLine().toLowerCase();
        if (answer1.contains("inheritance") || answer.contains("polymorphism") ||
                answer1.contains("encapsulation") || answer.contains("abstraction")) {
            System.out.println("Great! You know your OOP!");
            grade2++;
        } else {
            System.out.println("Missed something. The correct ones are: Inheritance, Polymorphism, Encapsulation, Abstraction.");
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
        System.out.println("\nLesson 3: Algorithms");
        System.out.println("Question: What is the time complexity of binary search?");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("O(log n)") || answer.equalsIgnoreCase("log n")) {
            System.out.println("Correct!");
            grade2++;
        } else {
            System.out.println("The correct answer is O(log n).");
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
        System.out.println("\nProgramming Course Summary:");
        System.out.println("Attendance: " + attendance + "/3 lessons");
        System.out.println("Score: " + grade2 + "/3 tasks");
        if (grade2 == 3) {
            System.out.println("Excellent! You mastered Programming Course!");
        } else if (grade2 >= 2) {
            System.out.println("Good progress! Keep practicing.");
        } else {
            System.out.println("You need more coding practice.");
        }
    }
}
