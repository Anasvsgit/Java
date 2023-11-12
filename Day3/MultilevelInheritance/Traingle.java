package MultilevelInheritance;

public class Traingle extends Shape {
    public void area(double b, double h) {
        double area = (0.5 * b * h);
        System.out.println("The Triangle Area is " + area);
    }
}
