import java.util.Scanner;

public class IsPerfectNo {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();
        int sum=0;

        for(int i=1;i<num;i++){

            if(num%i==0){

                sum=sum+i;

            }

        }



        System.out.println(sum);

        if(num==sum){
            System.out.println("True");


        }else{
            System.out.println("False");
        }


        
    }
}
