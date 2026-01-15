
import java.util.Scanner;

class LastFirst{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        char first=s.charAt(0);
        char second=s.charAt(s.length()-1);
        System.out.println("First character:"+first);
        System.out.println("Second character:"+second);
    }
}