public class GreaterPriorElementCount {

    public static void main(String[] args){

        int[] arr={1,2,3,4,2,3,5,6,1};
        int count=0;
        int max=0;
        

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){

               
                
                count++;
            }
            max=arr[i];
            
        }

        System.out.println(count);




    }
    
}
