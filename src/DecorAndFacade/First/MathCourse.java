package DecorAndFacade.First;

public class MathCourse implements Course {
   @Override
     public String deliverContent(){
       return " Math course.";}
    @Override
    public String hours(){
       return "Learn 80 hours.";
    }

}
