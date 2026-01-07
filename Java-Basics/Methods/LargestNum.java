
import java.util.Scanner;

class LargestNum{

    public int max(int a,int b,int c){
        if(a>=b&&a>=c){
            return a;
        }
        else if(b>=a&&b>=c){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {
        LargestNum ln=new LargestNum();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(ln.max(x,y,z)+" is the largest");

        sc.close();
    }
}