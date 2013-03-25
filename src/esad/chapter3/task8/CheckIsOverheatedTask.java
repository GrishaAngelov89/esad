package esad.chapter3.task8;

/**
 * @author grisha_angelov
 */
public class CheckIsOverheatedTask implements Task{
    Alarm alarm = new Alarm();
    HeatSensor heatSensor = new HeatSensor();
    PowerSupply powerSupply = new PowerSupply();

    @Override
    public void execute() {
        if (heatSensor.isOverHeated()) {
            powerSupply.turnOff();
            alarm.turnOn();
        }
    }
}
