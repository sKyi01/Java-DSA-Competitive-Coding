public class TestBinary {

    public static int powerOfTwo(int exponent){
        int result=1;
        for(int i=0;i<exponent;i++){


            result*=2;
        }

        return result;
    }
    

    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int sum=0;
        int power=0;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==1){

                sum+=powerOfTwo(power);

            }
            power++;

        }

        System.out.println(sum);
    }
}
