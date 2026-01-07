
import java.util.Scanner;

class SumDigits{
    private int sumOfDigits(int n){
        int sum=0;
        int num;
        while (n>0) {
                num=n%10;
                sum+=num;
                n/=10;         
        }
        return sum;
    }
    public static void main(String[] args) {
        SumDigits sd=new SumDigits();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        System.out.println("Sum of digits is "+sd.sumOfDigits(number));

    }
}