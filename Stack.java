import java.util.Scanner;
public class Stack {

    static int[] num = new int[5];

    static int top = -1;


    public static void main(String[] args) {
        System.out.println(num.length);

        Scanner sc = new Scanner(System.in);




        do {
            System.out.println();
            System.out.println("select your choice");
            int chosen = sc.nextInt();


            switch (chosen) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;

                case 3:
                    displayStack();
                    break;
                default:
                    System.out.println("wrong choice");
                    break;





            }





        }
        while (true);









    }


    public static void push() {

        System.out.println("Push any element..");
        Scanner sc = new Scanner(System.in);


        if (top >= num.length - 1) {

            System.out.println("Stack overflowed...");



        } else {
            top++;

            int ele = sc.nextInt();

            num[top] = ele;

            System.out.println("Element Inserted: " + ele);

        }
    }


    public static void pop() {


        if (top < 0) {

            System.out.println("stack underflowed...");





        } else {
            System.out.println("poped element is : " + num[top]);


            top--;





        }




    }

    public static void displayStack() {

        for (int i = 0; i <= top; i++) {

            System.out.print("--" + num[i] + "--");



        }


    }








}
