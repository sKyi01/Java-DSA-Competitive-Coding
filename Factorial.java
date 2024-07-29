import java.util.Scanner;


public class Factorial {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Factorial Number");

        int num=sc.nextInt();
        int temp=1;

        for(int i=num;i>=1;i--){

            temp=temp*(i);



        }

        System.out.println(temp);



        


    }
    
}
