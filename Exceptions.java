    import java.util.Scanner;


    class CustomException extends Exception
    {

        public CustomException(String s1)
        {
           System.out.println(s1);
    }
}

    public class Exceptions {
        public static void main(String[] args) throws CustomException {
            
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the numerator");
            int num1 = sc.nextInt();

            System.out.println("Enter the denominator");
            int num2 = sc.nextInt();

            try {
                int result = divide(num1 , num2);
                System.out.println(result);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            finally
            {
                sc.close();
            }

        }

        public static int divide(int n1 , int n2) throws ArithmeticException, CustomException

        {
            if(n2 == 0)
            {
                throw new ArithmeticException("Cannot divide by zero");
            }
            else if(n2 == 1)
            {
                throw new CustomException("Cannot divide by 1");
            }


            return n1/n2;
        }


    }
