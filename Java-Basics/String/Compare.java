
import java.util.Scanner;

class Compare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string:");
        String s=sc.nextLine();
        System.out.print("Enter second string:");
        String t=sc.nextLine();
        //using ==
        System.out.println(s==t);

        //using equals()
        System.out.println(s.equals(t));
    }
}