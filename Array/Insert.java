
import java.util.Scanner;

class Insert{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1, 3, 4, 2, 3};
        int[] nums=new int[arr.length+1];

        System.out.println("Enter the position to insert:");
        int pos=sc.nextInt();

        for (int i = 0; i < pos; i++) {
            nums[i]=arr[i];
        }

        System.out.println("Enter the element to insert:");
        int enter=sc.nextInt();
        nums[pos]=enter;

        for (int i = pos; i < arr.length; i++) {
            nums[i+1]=arr[i];
        }

        System.out.println("After:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}