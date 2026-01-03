
import java.util.Scanner;
class VowelConsonant{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any character:");
        char a=sc.next().charAt(0);
        char ch=Character.toLowerCase(a);
        if(!Character.isLetter(ch)){
            System.out.println("This is not a character");
        }
        else{
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("It is a vowel");
                    break;
                default:
                    System.out.println("It is a consonant");
            }
        }
    }
}