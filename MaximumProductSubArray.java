public class MaximumProductSubArray {

    public static void main (String[] args){
        int[] arr={1,2,3,4,5,0};
        int product=1;

        for(int i=0; i<arr.length;i++){

            if(arr[i]!=0){
                product= product*arr[i];

            }
        }

        System.out.println(product);
    }
    
}
