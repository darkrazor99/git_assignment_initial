import java.util.ArrayList;
import java.util.List;

public class Topic {
	
	private List<ISubscriber> subscribers;
	
	public Topic() {
		subscribers = new ArrayList<ISubscriber>();
	}
	
	public void addSubscriber(ISubscriber sub) {
		subscribers.add(sub);
	}
	
	public List<ISubscriber> getSubscribers() {
		return subscribers;
	}
	
	public ISubscriber getSubscriber(int index) {
		return getSubscribers().get(index);
	}
	
	public void menu() {
		System.out.println("\nChoose operation you want :");
		System.out.println("1-Lucas Series\n2-Sphere Volume\n3-Circle Area\n4-Ball Volume\n5-Power N\n6-Sphere Area"
				+ "\n7-Summation Series\n8-circleCircumferenc\n9-Fibonacci\n10-Fibonacci\n11-SphereCircumference");
		System.out.println("13-Execute All\nAny other input to close\n");
	}
	
	public void dispatchEvent(String input,int index) {
		getSubscriber(index).notifySubscriber(input);
	}
	
	public void dispatchEvents(String input) {
		for (ISubscriber sub : this.getSubscribers()) {
			sub.notifySubscriber(input);
		}
	}
}
