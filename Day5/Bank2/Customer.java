package Day5.Bank2;

import Day5.Bank.Account;

public class Customer extends Account {
    public static void main (String[]args)
    {
        Customer x = new Customer();
        x.address="HAL,LBS Nagar,BANGALORE";
        x.location="Bangalore";
        x.setAcc_no("accno 87654");
        x.setIfsc_code("ifsccode 98765432");
        x.amount=50000.00;
        System.out.println(x.address);
        System.out.println(x.location);
        System.out.println(x.amount);
        System.out.println(x.getAcc_no());
        System.out.println(x.getIfsc_code());
    }

}
