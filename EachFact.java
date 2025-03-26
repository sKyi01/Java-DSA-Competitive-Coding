import java.util.*;
public class EachFact {

    public static int getFactEach(int num){
        int fact=1;
       
        
        for(int i=1;i<=num;i++){

            fact=fact*i;

            

        }

        return fact;



    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] arr= new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sc.nextLine();
        }

        for(int i=0;i<arr.length;i++){
           System.out.println(getFactEach(arr[i])); 
        }

    




        
    }
}
