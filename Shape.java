public abstract class Shape {
    abstract void draw();

    abstract void resize();
}

class Circle extends Shape {

    void draw()
    {
        System.err.println("Drawing Circle");
    }

    void resize()
    {
        System.out.println("Resizing");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.resize();
    }
}
