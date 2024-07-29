import java.util.*;

public class MedianArray {

    public static void main(String[] args){

        int[] arr={2,3,4,5,6,8};
        int n= arr.length;
        int index1;
        int index2;

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


        if(n%2==0){

            index1= n/2;
            index2= (n/2)-1;

            System.out.println("Median is : "+  (double) (arr[index1]+arr[index2])/2);


        }
        else{
            System.out.println("Median is : "+ arr[n/2]);


        }






    }
    
}
