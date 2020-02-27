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
		System.out.println("1-Lucas Series\n2-Sphere Volume\n3-\n4-\n5-\n6-\n7-\n8-\n9-\n10-");
		System.out.println("11-Execute All\n");
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
