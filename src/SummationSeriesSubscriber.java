import java.text.ParseException;

public class SummationSeriesSubscriber implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        int in=Integer.parseInt(input);
        int result=(in*(in+1))/2;
        System.out.println("SummationSeries : " + result);
    }

}