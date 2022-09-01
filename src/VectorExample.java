import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector(20);
        Vector v3 = new Vector(30, 10);
        v2.add(100);
        v2.add(100);
        v2.add(100);
        Vector v4 = new Vector(v2);
        System.out.println("Vector 1 capacity " +v1.capacity());
        System.out.println("Vector 2 capacity " +v2.capacity());
        System.out.println("Vector 3 capacity " +v3.capacity());
        System.out.println("Vector 4 capacity " +v4.capacity());
    }
}
