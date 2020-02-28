import java.lang.Math.*;
public class CircleArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {

        double Area =  Math.PI*Double.valueOf(input)*Double.valueOf(input);
        System.out.println("Circle Area :  " + Area );

    }
}
