
public class MultiplicationSeriesSubscriber implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		
		System.out.println("MultiplicationSeries : " + getMultibS(Integer.parseInt(input)));
		
	}
	public int getMultibS(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum+= n*i;
		}
		return sum;
	}

}
