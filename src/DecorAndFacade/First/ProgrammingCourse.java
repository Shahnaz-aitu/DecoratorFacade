package DecorAndFacade.First;

public class ProgrammingCourse implements Course {
    @Override
    public String deliverContent(){
        return " Programming course.";
    }
    @Override
    public String hours(){
        return "Learn 120 hours";
    }
}
