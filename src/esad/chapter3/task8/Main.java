package esad.chapter3.task8;

/**
 * @author grisha_angelov
 */
public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        scheduler.addTask(new CheckIsCookedTask());
        scheduler.addTask(new CheckIsOverheatedTask());
        scheduler.run();
    }
}
