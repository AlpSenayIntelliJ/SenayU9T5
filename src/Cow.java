public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Moooooove over butter");
    }
}
