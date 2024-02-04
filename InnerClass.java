public class InnerClass {
    
    static class Test { // not dependent on obkect of innerclass
     String name;

     public Test(String name)
     {
        this.name = name;
     }
    }


    public static void main(String[] args) {
        Test a = new Test("Varun");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name); 
    }
}


