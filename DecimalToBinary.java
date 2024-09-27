public class DecimalToBinary {
    public static void main(String[] args) {

        int number=123;
        int i=0;

        int[] binary=new int[32];



        while(number!=0){
            binary[i]=number%2;
            number=number/2;
            i++;

        }
        
      for(int j=binary.length-1;j>=0;j--){
        System.out.print(binary[j]+ " ");


      }

    }
    
}
