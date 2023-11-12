package Day4.Superclass;

public class Person {
    String city ="Bangalore";
    int id=1234;

    Person(){
        System.out.println(id);
    }
    public void display(){
        System.out.println(city + " " + id);
    }
}
