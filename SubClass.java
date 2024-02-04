public class SubClass {

    int i;

    SubClass(int i)
    {
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
    

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public static void main(String[] args) {
        SubClass s = new SubClass(34);
        SubClass s2 = new SubClass(34);
        if(s == s2)
        {
            System.out.println("Pointing to the same thing");
        }
        if(s.equals(s2)) // checks the content
        {
           System.out.println("Hey");
        }
      }
    

}
