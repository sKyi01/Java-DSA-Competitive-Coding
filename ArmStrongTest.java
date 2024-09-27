public class ArmStrongTest {
    public static void main(String[] args) {
        int digit=153;
        int temp=0;
        int sum=0;

        while(digit>0){

            temp= digit%10;
            sum=sum+(temp*temp*temp);
            digit=digit/10;

        }

        System.out.println(sum);
    }
}
