package esad.chapter3.task10;

/**
 * @author grisha_angelov
 */
public class CourseOriginal {
    Session sessions[];
    double fee;
    CourseOriginal modules[];

    double getDuration() {
        int duration = 0;
        if (modules == null)
            for (int i = 0; i < sessions.length; i++)
                duration += sessions[i].getDuration();
        else
            for (int i = 0; i < modules.length; i++)
                duration += modules[i].getDuration();
        return duration;
    }

    double getFee() {
        if (modules == null)
            return fee;
        else {
            double totalFee = 0;
            for (int i = 0; i < modules.length; i++)
                totalFee += modules[i].getFee();
            return totalFee;
        }
    }
}
