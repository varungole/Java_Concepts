//Class
public class Car {

    //Attributes
    String name;
    int year;

    //Behaviours
    void show()
    {
        System.out.println(name);
    }
    public static void main(String[] args) {
        
        //object
        Car c1 = new Car();
        c1.name = "Ferrari";
        c1.year = 1999;

        c1.show();
    }
}