
import java.util.Scanner;

class PrimeNumber{
    private boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else{
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    return false;
                }
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeNumber pm=new PrimeNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(pm.isPrime(num)){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }
    }
}
/*
note: Loop checks every possible divisor

If any one divides n then stop and say not prime

If loop finishes then no divisor exists i.e. prime
*/