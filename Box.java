public class Box<T> {

    private T value;

    public Box(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(3);

        System.out.println(b1.getValue());
    }
}
