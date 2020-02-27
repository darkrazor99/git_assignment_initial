import java.lang.Math.*;
public class CircleArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {

        double Area =  Math.PI*Double.valueOf(input)*Double.valueOf(input);
        System.out.println("Hello, I am a Esraa subscriber and I am notified with Circle Radius :  " + Area );

    }
}
