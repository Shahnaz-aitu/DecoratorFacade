package DecorAndFacade.decorator;

public class MentorSupportDecorator extends CourseDecorator {
    public MentorSupportDecorator(Course course) {
        super(course);
    }
    public String getMentor() {
        return "Mentor Support.";
    }
    @Override
    public String deliverContent(){
        return super.deliverContent() + getMentor();
    }
}
