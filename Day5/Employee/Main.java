package Day5.Employee;

public class Main {
    public static void main(String[] args) {
        Employee x=new Employee();
        x.name="Anas";
        x.deptname="java";
        x.location="Bangalore";
        x.setEmpid(1012);
        System.out.println(x.name);
        System.out.println(x.deptname);
        System.out.println(x.location);
        System.out.println(x.getEmpid());

    }

}
