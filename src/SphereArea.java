
import java.lang.Math.*;
public class SphereArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {

        System.out.println("Sphere volume : " + 4.0*(Math.PI)* (Math.pow(Double.parseDouble(input),2)));

    }
}