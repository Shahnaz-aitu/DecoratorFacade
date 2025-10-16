package DecorAndFacade;
import DecorAndFacade.First.MathCourse;
import DecorAndFacade.First.ProgrammingCourse;
import DecorAndFacade.decorator.*;

import java.util.Scanner;

public class StudentPortalFacade {
    Scanner scanner = new Scanner(System.in);
    public String enrolledCourse;
    public String courseName;
    private boolean learningStarted = false;

    public String logIn() {
        System.out.println("LogIn please: ");
        String studentName = scanner.nextLine();
        return studentName;
    }
    public String enrollInCourse() {
        MathCourse mathCourse = new MathCourse();
        ProgrammingCourse programmingCourse = new ProgrammingCourse();
        MentorSupportDecorator mentorMath = new MentorSupportDecorator(mathCourse);
        MentorSupportDecorator mentorProg = new MentorSupportDecorator(programmingCourse);
        GamificationDecorator gamiMath = new GamificationDecorator(mathCourse);
        GamificationDecorator gamiProg = new GamificationDecorator(programmingCourse);

        System.out.println("Choose a course to be enrolled(math)(programming)(both)");
        String choice = scanner.nextLine().toLowerCase();

        System.out.println("What support do you want?(Mentor)(Gamification)(both)");
        String support = scanner.nextLine().toLowerCase();

        String result=null;
        switch (support) {
            case "mentor":
                if (choice.equals("math"))
                    result=mentorMath.deliverContent();
                else result= mentorProg.deliverContent();
                break;
            case "gamification":
                if (choice.equals("math"))
                    result = gamiMath.deliverContent();
                else result=gamiProg.deliverContent();
                break;
            case "both":
                if (choice.equals("math"))
                    result= new MentorSupportDecorator(new GamificationDecorator(mathCourse)).deliverContent();
                else result=new MentorSupportDecorator(new GamificationDecorator(programmingCourse)).deliverContent();
        }
        courseName=choice;
        enrolledCourse=result;
        return result+ " Course successfully enrolled!";
    }

    public String startLearning() {
        String courseInfo = enrolledCourse;
        if (courseInfo == null) {
            return "You are not enrolled in any course.";
        } else {
            learningStarted = true;
            return courseInfo + " — Start Learning! ";
        }
    }

    public String completeCourse() {
        if (enrolledCourse == null) {
            return "You are not enrolled in any course.";
        }
        if (!learningStarted) {
            return "You need to start learning before completing the course!";
        }
        CertificateDecorator certificateMath= new CertificateDecorator(new MathCourse());
        CertificateDecorator certificateProg = new CertificateDecorator(new ProgrammingCourse());
        String courseWas = startLearning();

        String completeCourse=null;
            if (courseName.equals("math"))
                completeCourse = certificateMath.deliverContent();
            if (courseName.equals("programming"))
                completeCourse = certificateProg.deliverContent();

            return completeCourse;
    }
}
