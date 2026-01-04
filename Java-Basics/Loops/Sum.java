import java.util.Scanner;
class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        int i=0;
        while(i <= num){
            sum+=i;
            i++;
        }
        System.out.println("Sum: "+sum);

    }
}