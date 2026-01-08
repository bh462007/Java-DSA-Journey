
import java.util.Scanner;

class EvenOddEle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of array elements:");
        int total=sc.nextInt();

        int[] num=new int[total];

        System.out.println("Enter array elements:");
        for (int i = 0; i < total; i++) {
            num[i]=sc.nextInt();
        }
        
        System.out.println("The even elements:");
        for (int i = 0; i < total; i++) {
            if(num[i]%2==0){
                System.out.println(num[i]);
            }
        }

        System.out.println("The odd elements:");
        for (int i = 0; i < total; i++) {
            if(num[i]%2!=0){
                System.out.println(num[i]);
            }
        }

    }
}