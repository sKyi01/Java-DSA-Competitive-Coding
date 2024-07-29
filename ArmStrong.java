public class ArmStrong {
    public static void main(String[] args){

        int num=265;
        int realNum=num;
        
        int sum=0;
        int cube=1;
        int temp=1;

        while(num>0){
            temp= num%10;

            sum=sum+(temp*temp*temp);

            num=num/10;
            
           

        }

     //   System.out.println(num );

        if(sum==realNum){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }

    }
} 
