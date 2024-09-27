import java.util.Scanner;

public class SumOfTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        int temp=0;

        for(int i=1;i<=10;i++){
            temp= temp+(n*i);

        }

        System.out.println(temp);
        
    }
    
}
