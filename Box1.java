public class Box1 extends Box {

    double weight;

    public Box1()
    {
        this.weight = -1;
    }

    public Box1(double l , double w , double h , double weight)
    {
        super(l , w , h); // these values exist in Box , call the parent class constructor
        this.weight = weight;
    }
    public static void main(String[] args) {
     
    }
}
