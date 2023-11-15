package Day5.Employee2;

import Day5.Employee.Employee;
public class Employelocation extends Employee {
    public static void main(String[] args) {
        Employelocation e1=new Employelocation();
        e1.location="Bangalore";
        System.out.println("Employee location:"+e1.location);
        e1.display();
    }
}
