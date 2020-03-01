import java.lang.Math.*;
public class circleCircumference implements ISubscriber {
	  @Override
	    public void notifySubscriber(String input) {
	     
	        System.out.println("circleCircumference  : " + 2.0 *(Math.PI)* Double.parseDouble(input));
	    
	    }
}
