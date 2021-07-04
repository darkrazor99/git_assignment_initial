import java.lang.Math.*;
public class SphereCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        System.out.println("Sphere Circumference : " + 2.0*(Math.PI)* Double.parseDouble(input));

    }
}
