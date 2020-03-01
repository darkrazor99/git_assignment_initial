import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new LucasSeries(),
			new SphereVolume(),
			new CircleArea(),
			new BallVolumeSubscriber(),
			new powerNSubscriber(),
			new SphereArea(),
			new SummationSeriesSubscriber(),
			new circleCircumference(),
			new FibonacciSubscriber(),
			new MultiplicationSeriesSubscriber(),
			new SphereCircumference()
	};
	
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		Boolean flag = true;
		Scanner sc = new Scanner(System.in);
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		
		while(flag) {
			mathTopic.menu();
			String choose = sc.nextLine();
			int c = Integer.parseInt(choose);
			
			if( c > 0 && c < 11) {
				System.out.print("Enter Your Number :");
				String input = sc.nextLine();
				mathTopic.dispatchEvent(input,c-1);
			}
			else if(c == 13) {
				System.out.print("Enter Your Number :");
				String input = sc.nextLine();
				mathTopic.dispatchEvents(input);
			}
			else {
				System.out.println("See You Later :)");
				flag = false;
			}
			
		}
	}
}
