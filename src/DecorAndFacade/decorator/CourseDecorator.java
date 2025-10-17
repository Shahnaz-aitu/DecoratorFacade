package DecorAndFacade.decorator;

import DecorAndFacade.First.Course;

public class CourseDecorator implements Course {
    protected Course course;
    public CourseDecorator(Course course) {
        this.course = course;
    }

    @Override
    public String deliverContent() {
        return course.deliverContent();
    }

    @Override
    public void lesson1() { course.lesson1(); }
    @Override
    public void lesson2() { course.lesson2(); }
    @Override
    public void lesson3() { course.lesson3(); }

    @Override
    public void conclusion() { course.conclusion(); }

}
