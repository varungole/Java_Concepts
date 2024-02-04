package exceptionHandling;

public class Main {
    
    static int divide(int a , int b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException("Do not divide by zero");
        }

        return a/b;
    }

    public static void main(String[] args) throws CustomException {
        String name = "Varun";
        if(name.equals("Varun"))
        {
            throw new CustomException("Not allowed");
        }
        
        try {

        }
        catch (ArithmeticException e)
        {
            System.out.println("You cannot divide by 0 son");
        }

        finally{
            System.out.println("This will run always");
        }

    }
}
