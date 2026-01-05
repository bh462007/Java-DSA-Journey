import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        
        int first=0;
        int second=1;
        if(num>=1){
            System.out.println(first);
        }
        if(num>=2){
            System.out.println(second);
        }
        for (int i = 3; i <= num; i++) {
            int next=first+second;
            System.out.println(next);
            first=second;
            second=next;
            
        }

    }
}