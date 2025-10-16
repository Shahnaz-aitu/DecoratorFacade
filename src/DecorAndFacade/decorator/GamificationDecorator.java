package DecorAndFacade.decorator;

public class GamificationDecorator extends CourseDecorator {
    public GamificationDecorator(Course course) {
        super(course);
    }
    public String getGamification() {
        return "Gamification your course is successfully decorated.";
    }

    @Override
    public String deliverContent(){
        return super.deliverContent() + getGamification();
    }
}
