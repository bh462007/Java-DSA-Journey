import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        int num=number;
        int rev=0;
        while (num>0) { 
            int n=num%10;
            rev=(rev*10)+n;
            num=num/10;
        }
        if(rev==number){
            System.out.println("The number is a Palindrome");
        }
        else{
            System.out.println("The number is a not palindrome");
        }
    }
}