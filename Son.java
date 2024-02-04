public class Son extends AbstractClass{
    @Override
    void career(String name){
        super.normal();
    }
    public static void main(String[] args) {
        AbstractClass varun = new Son();
        
        varun.career("Coder");


        


    }
}
