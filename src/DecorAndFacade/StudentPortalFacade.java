package DecorAndFacade;
import DecorAndFacade.First.*;
import DecorAndFacade.BuilderForLogin.*;
import DecorAndFacade.decorator.*;
import java.util.Scanner;

public class StudentPortalFacade {
    Scanner scanner = new Scanner(System.in);
    private StudentDirector director;
    private Course currentCourse;
    public StudentPortalFacade(StudentDirector director) {
        this.director = director;
    }

    public String enrollInCourse() {
        Student student = director.getCurrentStudent();
        if (student == null) return "You must log in first!";
        System.out.println("Choose the course you want to enroll in: math / programming");
        String course = scanner.nextLine().toLowerCase();

        System.out.println("Do you want support? (mentor / gamification / both / none)");
        String option = scanner.nextLine().toLowerCase();
        if (student.getCourse() == 3 && course.equals("math") || student.getCourse() == 3 && option.equals("mentor")){
            return "Sorry, students of course 3 cannot enroll in Math with Mentor support.";
        }

        String content;
        if (option.equals("mentor")) {
            if (course.equals("math")) content = new MentorSupportDecorator(new MathCourse()).deliverContent();
            else if(course.equals("programming"))content = new MentorSupportDecorator(new ProgrammingCourse()).deliverContent();
            else {content = new MentorSupportDecorator(new BothCourse()).deliverContent();}
        } else if (option.equals("gamification")) {
            student.setHasGamification(true);
            if (course.equals("math")) content = new GamificationDecorator(new MathCourse()).deliverContent();
            else if(course.equals("programming"))content = new GamificationDecorator(new ProgrammingCourse()).deliverContent();
            else {content = new GamificationDecorator(new BothCourse()).deliverContent();}
        } else if (option.equals("both")) {
            student.setHasGamification(true);
            if (course.equals("math")) content = new BothDecorator(new MathCourse()).deliverContent();
            else if(course.equals("programming"))content = new BothDecorator(new ProgrammingCourse()).deliverContent();
            else {content = new BothDecorator(new BothCourse()).deliverContent();}
        } else {
            content = course.equals("math") ? new MathCourse().deliverContent() : new ProgrammingCourse().deliverContent();
        }

        student.setEnrolledCourse(course);
        student.setSupported(option);
        System.out.println("Successfully enrolled in " + course + "!");
        return content;
    }
    public void startLearning() {
        Student student = director.getCurrentStudent();
        if (student == null) {
            System.out.println("You must log in first!");
            return;
        }
        if(student.getEnrolledCourse()== null) {
            System.out.println("You must enroll in a course first!");
            return;
        }
        String courseName = student.getEnrolledCourse().toLowerCase();
        String support=student.getSupported();
        Course baseCourse;
        switch (courseName) {
            case "math":
                baseCourse = new MathCourse();
                break;
            case "programming":
                baseCourse = new ProgrammingCourse();
                break;
            case "both":
                baseCourse = new BothCourse();
                break;
            default:
                System.out.println("Unknown course!");
                return;
        }

        if (support.equals("mentor"))
            baseCourse = new MentorSupportDecorator(baseCourse);
        else if (support.equals("gamification"))
            baseCourse = new GamificationDecorator(baseCourse);
        else if (support.equals("both"))
            baseCourse = new BothDecorator(baseCourse);

        System.out.println("Starting lessons in " + courseName + "...\n");

        baseCourse.lesson1();
        baseCourse.lesson2();
        baseCourse.lesson3();

        if (support.equals("gamification") || support.equals("both"))
            baseCourse.conclusion();

        System.out.println("Course completed!");
        student.addAttendee();

    }
    public void completeCourse() {
        Course currentCours;
        Student student = director.getCurrentStudent();

        if (student.getAttendees() < 1) {
            System.out.println("You must attend at least one lesson to complete!");
            return;
        }
        if (student.getEnrolledCourse() == "math") {
            if (student.hasGamification()) {
                currentCours = new CertificateDecorator(new GamificationDecorator(new MathCourse()));
                System.out.println("Course completed.Progress: " + (student.getAttendees() * 33) +"% ");
            } else {
                currentCours = new CertificateDecorator(new MathCourse());
                System.out.println("Course completed!");
            }
        }
            else if (student.getEnrolledCourse() == "programming") {
            if (student.hasGamification()) {
                currentCours = new CertificateDecorator(new GamificationDecorator(new ProgrammingCourse()));
                System.out.println("Course completed.Progress:" + (student.getAttendees() * 33) +"% ");
            } else {
                currentCours = new CertificateDecorator(new ProgrammingCourse());
                System.out.println("Course completed!");
            }
        }
            else {
            if (student.hasGamification()) {
                currentCours = new CertificateDecorator(new GamificationDecorator(new BothCourse()));
                System.out.println("Course completed.Progress:" + (student.getAttendees() * 33) +"% ");
            } else {
                currentCours = new CertificateDecorator(new BothCourse());
                System.out.println("Course completed!");
            }
        }

    }
}