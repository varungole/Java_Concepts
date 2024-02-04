package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    

    public static void main(String[] args) {
        Student varun = new Student(1, 99.99f);
        Student rahul = new Student(2,  100f);
        Student akshay = new Student(3,  77.7f);
        Student akash = new Student(4,  88.9f);
        Student ashish = new Student(5,  100f);

        Student[] list = {varun , rahul , akshay , akash , ashish};

        Arrays.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o1.getMarks(), o2.getMarks());
            }
        });
        System.out.println(list);
        /* 
        if(rahul.compareTo(varun) < 0)
        {
            System.out.println("Varun has more marks");
        }
        else
        {
            System.out.println("Rahul has more marks");
        }
        */

    }
}
