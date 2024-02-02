public class StaticTry {
    
     static int count = 0;

    void one()
    {
        count++;
    }
 
    void two()
    {
        count++;
    }

    void print()
    {
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticTry s = new StaticTry();
        StaticTry s2 = new StaticTry();
        s.one();
        s.two();
        s.print();

        s2.one();
        s2.two();
        s2.print();

         
    }
}
