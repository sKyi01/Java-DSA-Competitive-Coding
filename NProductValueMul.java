import java.util.Scanner;

public class NProductValueMul {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product Value");
        int n=sc.nextInt();
        int res=1;

        while(n>0){
            res=res*(n%10);
            n=n/10;



        }

        System.out.println(res);





    }
    
}
