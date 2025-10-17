package DecorAndFacade.decorator;

import DecorAndFacade.First.Course;

public class BothDecorator extends CourseDecorator {
    public BothDecorator(Course course) {
        super(new GamificationDecorator(new MentorSupportDecorator(course)));
    }
    @Override
    public String deliverContent() {
        return super.deliverContent();
    }
}
