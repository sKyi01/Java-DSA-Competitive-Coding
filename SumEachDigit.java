public class SumEachDigit {
    public static void main(String[] args) {
        int a=567890;
        int sum=0;
        int temp=0;

        while(a>0){
            temp= a%10;
            sum+=temp;
            a=a/10;

        }

        System.out.println(sum);
    }
}
