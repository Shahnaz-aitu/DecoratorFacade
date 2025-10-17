package DecorAndFacade.decorator;

import DecorAndFacade.First.Course;

public class MentorSupportDecorator extends CourseDecorator {
    public MentorSupportDecorator(Course course) {
        super(course);
    }
    private void mentorHelp() {
        System.out.println("Mentor:Wow! Let me explain...");
        System.out.println("Tip: Review the concept again and try next time!");
    }
    @Override
    public void lesson1() {
         super.lesson1();
        mentorHelp();
    }
    @Override
    public void lesson2() {
        super.lesson2();
        mentorHelp();
    }
    @Override
    public void lesson3() {
       super.lesson3();
       mentorHelp();
    }
    @Override
    public String deliverContent() {
        return super.deliverContent() + "[Mentor Support]\n";
    }
}
