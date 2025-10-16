package DecorAndFacade.decorator;
import DecorAndFacade.First.Course;

public class CourseDecorator implements Course {
    private Course course;
    public CourseDecorator(Course course) {
        this.course = course;
    }
    @Override
    public String deliverContent(){
        return course.deliverContent() +course.hours();
    }
    @Override
    public String hours(){
        return course.hours();
    }

}
