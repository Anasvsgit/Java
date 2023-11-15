package Library;

public class AdultUsers implements Libraryuser{
    int age;
    String bookType;

    public void Add(int age,String bookType){
        this.age=age;
        this.bookType=bookType;

    }

    @Override
    public void registerAccount() {
        if (age>12){
            System.out.println("“You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType == "Fiction") {
            System.out.println("“Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
    public static void main(String[] args){
        AdultUsers Au1=new AdultUsers();
        Au1.Add(18,"Fiction");
        Au1.registerAccount();
        Au1.requestBook();
        AdultUsers Au2=new AdultUsers();
        Au2.Add(5,"Kids");
        Au2.registerAccount();
        Au2.requestBook();

    }
}
