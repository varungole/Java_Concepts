public class HumanMain {
    
    static int a = 4;
    static int b = 5;




    static void greeting()
    {
        System.out.println("Hi");
    }

     void fun()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Human varun = new Human(24,"Varun", 30, false);
        Human rahul = new Human(21,"Rahul", 15, true);
        Human ashish = new Human(18,"Ashish", 0, true);


        System.out.println(Human.population);
        System.out.println(Human.population); // population exists in class


        //any property to all human?
    }
}
