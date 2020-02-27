
public class LucasSeries implements ISubscriber {
	@Override
    public void notifySubscriber(String input) {
     
        System.out.println("Lucas Series : " + lucas(Integer.parseInt(input)));
    
    }
	int lucas(int n) 
	{ 
	    // Base cases 
	    if (n == 0) 
	        return 2; 
	    if (n == 1) 
	        return 1; 
	  
	    // recurrence relation 
	    return lucas(n - 1) +  
	           lucas(n - 2); 
	} 
}
