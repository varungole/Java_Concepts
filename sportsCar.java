public class sportsCar extends Car{
    int average;

    public static void main(String[] args) {
        sportsCar s1 = new sportsCar();
        s1.name = "Volvo";
        s1.year = 1999;
        s1.average = 100;
        
        s1.show();
    }
}
