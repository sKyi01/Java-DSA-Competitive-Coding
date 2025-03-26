import java.util.*;

public class ThreeOddTest{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int count=0;
        int temp=0;
        int num=sc.nextInt();

       while(num!=0){
        temp= num%10;

        if(temp%2!=0){
            count++;

        }

        num= num/10;
        
       }

      System.out.println("count of odd no : "+count);

      if(count>=3){
        System.out.println("True");

      }else{
        System.out.println("False");

      }




    }
}