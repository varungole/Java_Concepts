package interfaces;

public class Main { 
    public static void main(String[] args) {
        Engine car = new Car();
    
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
    }
}
