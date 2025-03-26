import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FindRank {

    public static int yrRank(int[] arr, int num){
        int rank=1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==num){

               

                break;

            }

            rank++;
            



        }

        return rank;

    }

    public static int[] sort(int[] arr){


        int temp=0;

        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                if(arr[i]>arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;



                }

            }
        }


        for ( int v : arr){

            System.out.print(v + " ");
        }


        return arr;



    }




    public static void main(String[] args) {
        int[] arr={65,43,76,32,98,3};
        int[] temp= arr.clone();
        
        sort(arr);
        int rank=0;

        for(int a : temp){

            System.out.println(a +" :  "+ yrRank(arr, a));
        }


       


    }
}
