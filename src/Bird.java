public class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("I am eating - Bird");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping - Bird");
    }
    public void fly() {
        System.out.println("I am flying - Bird");
    }
}
