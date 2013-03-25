package esad.chapter3.task8;

/**
 * @author grisha_angelov
 */
public class CheckIsCookedTask implements Task{
    MoistureSensor moistureSensor = new MoistureSensor();
    Heater heater = new Heater();


    @Override
    public void execute() {
        if (moistureSensor.getMoisture() < 60) {
            heater.setTemperature(50);
        }
    }
}
