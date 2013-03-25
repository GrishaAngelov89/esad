package esad.chapter3.task8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author grisha_angelov
 */
class Scheduler extends Thread {
    List<Task> taskList = new ArrayList<Task>();

    public void addTask(Task task) {
        taskList.add(task);
    }


    public void run() {
        System.out.println("running");
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Task task : taskList) {
                task.execute();
            }
        }
    }
}