package esad.chapter3.task10;

/**
 * @author grisha_angelov
 */
public class SessionCourse implements Course {
    private String courseTitle;
    private Session sessions[];
    private double fee;

    public SessionCourse(String courseTitle, double fee, Session sessions[]) {
        //...
    }

    @Override
    public int getDuration() {
        int duration = 0;
        for (int i = 0; i < sessions.length; i++) {
            duration += sessions[i].getDuration();
        }
        return duration;
    }

    @Override
    public double getFee() {
        return fee;
    }

    @Override
    public String getTitle() {
        return courseTitle;
    }

    void setFee(int fee) throws Exception {
        this.fee = fee;
    }
}
