
public class powerNSubscriber implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(input);
		System.out.println("2PowerN: " + Pow(x) );
	}
	int Pow (int n) {
		if (n==0)
			return 1;
		else 
			return 2*Pow(n-1);
	}

}
