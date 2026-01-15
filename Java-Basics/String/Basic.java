
import java.util.Scanner;

class Basic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Create a string using a literal and print it.
        String s1="Java with DSA";
        System.out.println(s1);

        //Create the same string using new and print it.
        String s2=new String("DSA and Java");
        System.out.println(s2);

        //create a string, append it with new and print both the strings
        String a="Ascii";
        String b= a + " and Bash";
        System.out.println("First string:"+a);
        System.out.println("Second string:"+b);

        //Create two strings with the same value using literals.
        String l1="Java";
        String l2="Java";
        System.out.println(l1 == l2);

        //Create one string using literal and one using new.
        String x="Hello";
        String y=new String("Hello");
        System.out.println(x == y);

        //using equals()
        String m="Morning";
        String n=new String("Morning");
        System.out.println(m.equals(n));

        //length()
        System.out.println("Length: "+s1.length());

        //charAt()
        char ch=s1.charAt(2);
        System.out.println(ch);

        //substring()
        System.out.println(s1.substring(5, 9));

        //equalsIgnoreCase()
        String a1="JAva";
        String b1="jaVA";
        System.out.println(a1.equalsIgnoreCase(b1));

        //toUpperCase() and toLowerCase()
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        //indexOf() and lastIndexOf()
        String s="Santa";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

        //contains()
        System.out.println(s2.contains("DSA"));
    }
}