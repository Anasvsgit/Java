package Day4.Override;

public class Main {
    public static void main(String[] args){
        Bank b1=new Bank();
        b1.loanpercentageforcurrentyear();
        Bank b2=new Kotak();
        b2.loanpercentageforcurrentyear();
        Bank b3=new HDFC();
        b3.loanpercentageforcurrentyear();
        Bank b4=new IDBI();
        b4.loanpercentageforcurrentyear();

    }
}
