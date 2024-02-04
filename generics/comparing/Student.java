package generics.comparing;

public class Student implements Comparable<Student> {

    int rollno;
    float marks;

    public Student(int rno, float marks)
    {
        this.rollno = rno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
       int diff = (int)(this.marks - o.marks);
       return diff;

       //diff == 0 --> equal
       // diff <  , o is bigger
       //dif > , o is smaller
    }

    

    @Override
    public String toString() {
        return marks + " ";
    }

    public float getMarks() {
        // TODO Auto-generated method stub
        return this.marks;
    }


    
}
