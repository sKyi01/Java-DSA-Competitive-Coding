
import java.util.Scanner;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedListJava {

    static Node head;

    public LinkedListJava() {
        this.head = null;

    }

    public static void InsertAtLast() {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            newNode.next = null;

        } else {

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

            newNode.next = null;
        }

    }

    public static void display() {
        Node temp = head;

        System.out.println("display all elements in list");

        do {
            System.out.print(temp.data + " ");

            temp = temp.next;

        } while (temp != null);
    }

    public void insertAtFirstPosition() {

        System.out.println("Insert Element at First Position");

        int num = new Scanner(System.in).nextInt();
        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;

    }

    public void insertElementAtAnyPosition() {
        Node temp = head;
        Node temp2 = head;
        System.out.println("Enter Element that..you want to store new element before given element");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Enter Data");
        int data = new Scanner(System.in).nextInt();
        Node newNode = new Node(data);

        while (temp.data != num) {

            temp = temp.next;

        }

        while (temp2.next != temp) {
            temp2 = temp2.next;

        }
        temp2.next = newNode;
        newNode.next = temp;

    }

    public void deleteAtFirst() {
        Node temp = head;
        head = temp.next;

        System.out.println("deleted element at first : " + temp.data);

    }

    public void deleteAtLast() {

        Node temp = head;
        Node temp2 = head;

        while (temp.next.next != null) {

            temp = temp.next;

        }

        temp.next = null;

    }

    public void deleteRandom() {

        Node temp = head;
        Node temp2 = head;
        System.out.println("Enter element that you want to delete");
        int num = new Scanner(System.in).nextInt();

        while (temp.data != num) {
            temp = temp.next;
        }
        while (temp2.next != temp) {
            temp2 = temp2.next;
        }

        temp2.next = temp.next;
        temp = null;

    }

    public static void main(String[] args) {

        LinkedListJava linkedListJava = new LinkedListJava();

        do {
            System.out.println(" ");
            System.out.println("Choose the option");

            System.out.println("1 : Display Elements");
            System.out.println("2 : Insert Element At First");
            System.out.println("3 : Insert Element At Last");
            System.out.println("4 : Insert Element At Random Position");
            System.out.println("5 : Delete Element At Fist Postion");
            System.out.println("6 : Delete Element At Last Postion");
            System.out.println("7 : Delete Any Element");

            int c = new Scanner(System.in).nextInt();

            switch (c) {
                case 1:
                    linkedListJava.display();
                    break;
                case 2:
                    linkedListJava.insertAtFirstPosition();
                    break;
                case 3:
                    linkedListJava.InsertAtLast();
                    break;
                case 4:
                    linkedListJava.insertElementAtAnyPosition();
                    break;
                case 5:
                    linkedListJava.deleteAtFirst();
                    break;
                case 6:
                    linkedListJava.deleteAtLast();
                    break;
                case 7:
                    linkedListJava.deleteRandom();
                    break;
                default:
                    System.out.println("Input Invalid");
                    break;

            }

        } while (true);

    }

}
