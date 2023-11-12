package Day2;

public class Employee {
    String name;
    int age;
    String dept;
    double salary;

    Employee(String name, int age, String dept, double salary) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
    }


}


