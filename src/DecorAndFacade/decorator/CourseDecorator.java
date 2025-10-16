package DecorAndFacade.decorator;

public class CourseDecorator implements Course {
    private Course course;
    public CourseDecorator(Course course) {
        this.course = course;
    }
    @Override
    public String deliverContent(){
        return course.deliverContent();
    }
}
