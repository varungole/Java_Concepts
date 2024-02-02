public class Singleton {
    
    private Singleton()
    {

    }

    private Singleton instance;
    
    public static void main(String[] args) {
        //only one object, you should not allow anyone to call the ocnstructor of that class
        Singleton obj = new Singleton();

    }
}
