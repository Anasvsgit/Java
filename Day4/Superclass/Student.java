package Day4.Superclass;

public class Student extends Person {
    String name ="Anas";
    String course = "Java";

    Student(){
        super();

    }

    public void msg(){
        System.out.println(name + " " + course);
    }
    public void display()
    {
        super.display();
    }
}
