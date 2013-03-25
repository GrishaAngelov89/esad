package esad.chapter2.task1;

/**
 * @author: grisha_angelov
 */
public class InchToPointConvertor {
    private static final int POINTS_IN_ONE_INCH = 72;

    static float convertToPoints(float inch) {
        return inch * POINTS_IN_ONE_INCH;
    }
}
