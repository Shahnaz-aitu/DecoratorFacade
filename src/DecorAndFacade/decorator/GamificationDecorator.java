package DecorAndFacade.decorator;

import DecorAndFacade.First.*;
import DecorAndFacade.decorator.*;

public class GamificationDecorator extends CourseDecorator {
    private int progress = 0;

    public GamificationDecorator(Course course) {
        super(course);
    }
    private void updateProgress() {
        progress += 33;
        if (progress > 100) progress = 100;
        System.out.println("Progress: " + progress + "%");
    }
    @Override
    public void lesson1() {
        super.lesson1();
        updateProgress();
    }

    @Override
    public void lesson2() {
        super.lesson2();
        updateProgress();
    }

    @Override
    public void lesson3() {
        super.lesson3();
        updateProgress();
    }

    @Override
    public void conclusion() {
        super.conclusion();
        System.out.println("Total progress: " + progress + "%");
    }
    @Override
    public String deliverContent() {
        return super.deliverContent()+ "[Gamification support]";
    }
}
