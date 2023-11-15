package Library;

public class KidUsers implements Libraryuser {
    int age;
    String bookType;
    public void Add(int age,String bookType) {
        this.age = age;
        this.bookType = bookType;
    }
    @Override
    public void registerAccount() {
        if (age<12) {
            System.out.println("You have successfully registered under a Kids Account");
        }
        else{
                System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if(bookType=="Kids"){
            System.out.println("“Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
    public static void main(String[] args){
        KidUsers Ku1=new KidUsers();
        Ku1.Add(10,"Kids");
        Ku1.registerAccount();
        Ku1.requestBook();
        KidUsers Ku2=new KidUsers();
        Ku2.Add(18,"Fiction");
        Ku2.registerAccount();
        Ku2.requestBook();

    }

}
