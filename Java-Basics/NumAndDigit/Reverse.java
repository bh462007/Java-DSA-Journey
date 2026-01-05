import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int rev=0;
        while (num>0) { 
            int n=num%10;
            rev=(rev*10)+n;
            num=num/10;
        }
        System.out.println("Reverse:"+rev);
    }
}