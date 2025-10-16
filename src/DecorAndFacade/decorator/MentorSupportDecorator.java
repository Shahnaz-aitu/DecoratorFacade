package DecorAndFacade.decorator;

import DecorAndFacade.First.Course;

public class MentorSupportDecorator extends CourseDecorator {
    public MentorSupportDecorator(Course course) {
        super(course);
    }
    public String getMentor() {
        return "Mentor Supported.";
    }
    @Override
    public String deliverContent(){
        return super.deliverContent() + getMentor()+super.hours();
    }

}
