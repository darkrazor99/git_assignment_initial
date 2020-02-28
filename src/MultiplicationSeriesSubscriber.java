
public class MultiplicationSeriesSubscriber implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		
		System.out.println("MultiplicationSeries : " + getMultibS(Integer.parseInt(input)));
		
	}
	public int getMultibS(int n) {
		if(n==1) return 1;
		else if(n==0)return 1;
		else return n*getMultibS(n-1);
	}

}
