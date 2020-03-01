import java.math.BigDecimal;

public class MultiplicationSeriesSubscriber implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		BigDecimal n=new BigDecimal(input);
		System.out.println("MultiplicationSeries : " + getMultibS(n));
		
	}
	public  BigDecimal getMultibS(BigDecimal n) {
		BigDecimal one=new BigDecimal("1");
		BigDecimal zero=new BigDecimal("0");
		if(n.equals(one)) return one;
		else if(n.equals(zero))return one;
		else return n.multiply(getMultibS(n.subtract(one)));
	}

}
