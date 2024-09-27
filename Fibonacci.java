public class Fibonacci {
    public static void main(String[] args) {
        int count=10;
        int first=0;
        int second=1;
        int sum=0;

        System.out.println(first+" "+ second);
        for(int i=0;i<count;i++){
            sum=first+second;
            System.out.println(sum);
            first=second;
            second=sum;
            sum=0;


            
        }

    }
    
}
