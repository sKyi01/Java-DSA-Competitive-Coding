import java.util.Scanner;

public class TwoFourWheeler {
    
    public static void main(String[] args){

        int tw=0;
        int fw=0;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter total numbers of vehicle");

        int vehicle= sc.nextInt();

        System.out.println("Enter total numbers of wheels");

        int wheel= sc.nextInt();

        tw= (4*vehicle-wheel)/2;
        fw= vehicle-tw;

        
        
        System.out.println(tw);
        System.out.println( fw);


        

        


        







    }
    
}
