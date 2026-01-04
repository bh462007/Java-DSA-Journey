import java.util.Scanner;
class Count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int count=0;
        for (int i = 1; i <= num; i++) {
            if(i%3==0){
                count++;
            }
            
        }
        System.out.println("Total count of numbers divisible by 3 is "+count);

    }
}