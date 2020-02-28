import java.text.ParseException;

public class SummationSeriesSubscriber implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        int in=Integer.parseInt(input);
        int sum=0;
        for (int i=in ; i>0 ;i--){
            sum+=i;
        }
        System.out.println("SummationSeries : " + sum);
    }

}