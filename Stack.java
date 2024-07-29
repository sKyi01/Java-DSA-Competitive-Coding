import java.util.Scanner;

public class Stack{

    static int[] arr= new int[5];
    static int temp=-1;
    static Scanner sc= new Scanner(System.in);



    public static void pushElement(){
        if(temp>5){
            System.out.println("Stack Overflow");
        }

        
        System.out.println("Enter the element to push");


        int e=sc.nextInt();

       
        temp++;
        arr[temp]=e;
        System.out.println("Element Inserted Successfullly");






    }

    public static void popElement(){

        if(temp<0){
            System.out.println("Stack Underflow");

        }

        temp--;
    }


    public static void printStack(){
        for(int i=0;i<=temp;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }




    public static void main(String[] args) {


       

        do{
            System.out.println("Select your choice");

            System.out.println("1 : Push");
            System.out.println("2 : Pop");
            System.out.println("3 : Display");
           // System.out.println("4 : Select your choice");
            int c= sc.nextInt();

       
        switch (c) {
            case 1:
            pushElement();
                
                
                
                break;
                case 2:
            popElement();
                
                
                
                break;
                case 3:
            printStack();
                
                
                
                break;
        
            default:
            System.out.println("Invalid Choice");
                break;
        }
    }
while(true);


        
    }



}