public class Primenumbers {
    public static void main(String[] args){
        for(int i=1;i<100;i++)
        {
            boolean isPrime = true;
            for(int j=2;j<100;j++)
            {
                if(i != j  && i%j == 0)
                {
                    isPrime = false;
                    break;
                }

            }
            if(isPrime)
            {
                System.out.println(i+" is prime");
            }
        }
    }
}
