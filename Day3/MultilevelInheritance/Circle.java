package MultilevelInheritance;

public class Circle extends Traingle {
    public void area(int r) {
        double area = 3.14 * r * r;
        System.out.println("The Circle Area is " + area);
    }
}
