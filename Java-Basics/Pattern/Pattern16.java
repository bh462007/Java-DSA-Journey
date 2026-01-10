
import java.util.Scanner;

class Pattern16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int iniS=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            iniS+=2;
            System.out.println();
        }
        iniS=iniS-4;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i+1; j++) {
                System.out.print("*");
            }
            iniS-=2;
            System.out.println();
        }
        
    }
}