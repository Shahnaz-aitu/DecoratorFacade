package DecorAndFacade.decorator;

import DecorAndFacade.First.Course;

public class CertificateDecorator extends CourseDecorator {
    public CertificateDecorator(Course course) {
        super(course);
    }
    public String getCourseCertificate() {
        return "You have successfully completed course: ";
    }
    @Override
    public String deliverContent(){
        return getCourseCertificate() + super.deliverContent();
    }
}
