package esad.chapter3.task10;

/**
 * @author grisha_angelov
 */
public class ModuleCourse implements Course {
    private String courseTitle;
    private Course modules[];


    public ModuleCourse(String courseTitle, Course modules[]) {
        //...
    }

    @Override
    public int getDuration() {
        int duration = 0;
        for (int i = 0; i < modules.length; i++) {
            duration += modules[i].getDuration();
        }
        return duration;
    }

    @Override
    public double getFee() {
        double totalFee = 0;
        for (int i = 0; i < modules.length; i++) {
            totalFee += modules[i].getFee();
        }
        return totalFee;
    }

    @Override
    public String getTitle() {
        return courseTitle;
    }
}
