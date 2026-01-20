
import java.util.Scanner;

class Binarysearch{
    public static void main(String[] args) {
        int[] arr={4,2,3,5,6,1};
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.print("Enter the target:");
        int target=sc.nextInt();
        int low=0;
        int high=arr.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid]==target){
                System.out.println("Target found position.");
                return;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Target not found");
    }
}