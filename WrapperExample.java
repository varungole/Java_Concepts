public class WrapperExample {
    
    public static void main(String[] args) {
        Integer num = 45; // like an object
        
        Integer a = 10;
        Integer b = 20;
        
    swap(a , b); // wont swap as everything is pass by value
    //even wrapper classes wont get swaped as they are final
    System.out.println(a + " " + b);

    final int BONUS = 2;
    

    //if not primitive, you can assign value but not reassign it
    final Student ashish = new Student();
    ashish.name = "Ashish";

    A obj;
    for(int i = 1 ; i < 1000000 ;i++)
    {
        obj = new A("Random name");
    }



    }

    static void swap(Integer a , Integer b)
    {
        int temp = a;
        a = b;
        b = temp;
        //it swaps only in this class
    }
}


//Garbage collection

// it is automatic
class A{
    final int num = 10;
    String name;

    public A(String name)
    {
        this.name = name;
    }
    
    @Override
    public void finalize() throws Throwable
    {
        System.out.println("Object is destroyed");
    }
}
