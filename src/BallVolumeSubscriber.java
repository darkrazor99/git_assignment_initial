public class BallVolumeSubscriber implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
        System.out.println("Ball volume : " + (4.0/3.0 )*(Math.PI)* (Math.pow(Double.parseDouble(input),3)));
	}
}
