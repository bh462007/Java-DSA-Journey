
import java.util.Scanner;

class Table{
    private void table(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }

    public static void main(String[] args) {
        Table t=new  Table();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        t.table(a);
        sc.close();

    }
}