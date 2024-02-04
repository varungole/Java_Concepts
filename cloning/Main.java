package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(18, "Kunal");
        

        Human twin = (Human)kunal.clone();

        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));

    }
}
