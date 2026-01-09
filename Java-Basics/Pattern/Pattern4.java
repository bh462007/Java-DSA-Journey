
import java.util.Scanner;

class Pattern4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int star=1;
        for (int i = 0; i < n; i++) {
            if(i%2==0) star=1;
            else star=0;
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
                star=1-star;
            }
            System.out.println(" ");
        }

    }
}