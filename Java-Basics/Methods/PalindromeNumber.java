
import java.util.Scanner;

class PalindromeNumber{

    private boolean isPlaindrome(int n){
        int temp=n;
        int rev=0;
        int num;
        while (temp>0) { 
            num=temp%10;
            rev=(rev*10)+num;
            temp/=10;            
        }
        return rev==n;
        
    }
    public static void main(String[] args) {
        PalindromeNumber pn=new PalindromeNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        if(pn.isPlaindrome(number)){
            System.out.println("Palidrome number");
        }
        else{
            System.out.println("Not palindrome");
        }

    }
}