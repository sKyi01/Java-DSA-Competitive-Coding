public class ReverseAnArray {
    
    public static void main (String[] args){

        int[] arr={9,8,7,6,5,4,3,2,1};
        int[] newArr= new int[arr.length];
        int j=0;

        for(int i=arr.length-1; i>=0; i--){

            newArr[j]=arr[i];
            j++;

          

        }

        for(int i=0; i<newArr.length; i++){

           System.out.println(newArr[i]);

          

        }




    }
}
