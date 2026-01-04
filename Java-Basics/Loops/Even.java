import java.util.Scanner;
class Even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if(i%2==0){
                System.out.println(i);
            }
            
        }

    }
}

/*
Check the variable you are iterating, not the variable you are looping against.

Once this clicks, loops become easy
*/