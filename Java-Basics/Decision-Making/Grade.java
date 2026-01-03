
import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total marks:");
        int total=sc.nextInt();
        if(total>=75){
            System.out.println("Congrats! \nA grade");
        }
        else if(total>=65){
            System.out.println("B grade");
        }
        else if(total>=55){
            System.out.println("C grade");
        }
        else if(total>=45){
            System.out.println("D grade");
        }
        else{
            System.out.println("Sorry,...you couldn't make it \n try again later");
        }

    }
}