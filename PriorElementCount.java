public class PriorElementCount {

    public static void main (String[] args){

        int[] arr={5,3,4,5,8,9};

        int max=Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                count++;
                


            }
            max=arr[i];
        }

        System.out.println(count);




    }
    
}
