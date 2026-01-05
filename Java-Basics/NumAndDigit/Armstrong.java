import java.util.Scanner;
class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        int  num=number;
        int count=0;
        while (num>0) { 
            num=num/10;
            count++;
        }

        int temp=number;
        int sum=0;
        while (temp>0) { 
            int n=temp%10;
            sum=(int) (sum+Math.pow(n, count));
            temp/=10;
        }

        if(sum==number){
            System.out.println("Armstrong number or narcissistic number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}