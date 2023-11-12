package SingleInheritance;

public class Rectangle extends Shape{
    int length;
    int breadth;
    public void area(int length,int breadth){
        System.out.println("area is"+length*breadth);
    }
}
