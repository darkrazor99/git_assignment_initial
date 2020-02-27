import java.lang.Math.*;
public class SphereVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
     
        System.out.println("Sphere volume : " + (4.0/3.0 )*(Math.PI)* (Math.pow(Double.parseDouble(input),3)));
    
    }
}
