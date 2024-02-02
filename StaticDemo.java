public class StaticDemo {
    
    static int a = 4;
    static int b;
    
    //RUN ONLY ONCE WHEN FIRST OBJ IS CREATED
    static {
        System.out.println("Hey");
        b = a*4;
    }

    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();
        StaticDemo.b += 3;
        
        StaticDemo obj1 = new StaticDemo();

        System.out.println(obj1.a + " " + obj1.b);
    }
}