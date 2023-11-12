public class Palindrrome {
    public static void main(String[] args){
        String a ="2002";
        String b ="";

        for(int i=0;i<a.length();i++){
            b = b+a.charAt((a.length() -1 )-i);

        }
        if (a == b)
        {
            System.out.println("P");
        }
        else {
            System.out.println("N");
        }


    }


}
