package fibonacci;

public class Fibonacci {

    public int fib(int i) {
        if(i==0) return 0;
       // return 1;(1)
        if(i<=2) return 1;
        //return 2; (2)
       // return fib(i-1)+1; (3)
        return fib(i-1)+fib(i-2);// (4)
    }
}
