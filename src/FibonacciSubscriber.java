public class FibonacciSubscriber implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {

        /**
         * this is fibonacci program up to given input using recursion
         * 27/2/2020 -> SW2 Assignment
         **/

        System.out.println("Fibonacci up to "+ input + " is : ");
        System.out.print("0 , 1");
        int limit = Integer.parseInt(input);
        calcFibonacci(0,1,1,limit);
    }
    private void calcFibonacci(int first , int second , int result , int limit){
        if (result > limit) return ;
        else {
            System.out.print(" , " + result);
            calcFibonacci(second , result , second+result , limit);
        }

    }
}
