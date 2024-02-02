public class introduction {
   
    public static void main(String[] args) {

    Student[] students = new Student[5];

    Student kunal = new Student();
    Student random = new Student(kunal);
    System.out.println(random.name);

    Student arpit = new Student(2 , "Arpit" , 89.7);
    System.out.println(arpit.name);

    }
}

class Student {
    //data of 5 students
     int rno;
     String name;
     double marks;


     //We need some way to add the below values  of the abobe properties for every object (it might be different btw);
     public Student()
     {
        this.rno = 14; //here, this is the object kunal
        this.name = "Varun";
        this.marks = 88.8f;
     }

     public Student(Student other)
     {
        this.name = other.name + "Test";
        this.rno = other.rno;
        this.marks = other.marks;
     }

     public Student(int no , String n , double d)
     {
        this.rno = no;
        this.name = n;
        this.marks = d;
     }

     
}