package generics.comparing;
import java.util.*;
import java.util.function.Consumer;

public class LambdaFunction {

    int[] arr = {3,4,5,1};
    
    int sum(int a, int b) {
        return a + b;
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < 5 ; i++) {
            list.add(i+1);
        }

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);

        list.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;
        Operation div = (a,b) -> a/b;
        Operation sub = (a,b) -> a-b;

        LambdaFunction lambdaFunction = new LambdaFunction();
        
        // Example usage of the operate method
        System.out.println(lambdaFunction.operate(5, 3, sub));  // Output: 8
    }
}

interface Operation {
    int operation(int a , int b);
}