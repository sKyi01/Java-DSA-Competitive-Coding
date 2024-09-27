package DSA.IPA;
import java.util.Scanner;

public class Associate_For_Given_Technology {

    public static Associate[] arr = new Associate[5];

    public static Associate[] associatesForGivenTechnology(Associate[] arr, String tech) {

        Associate[] newArr = new Associate[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getTech().equalsIgnoreCase(tech) && arr[i].getExperience() % 5 == 0) {

                newArr[index] = arr[i];
                index++;

            }
        }

        return newArr;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        String technology;
        int experienceInYears;
        Associate[] newArr = new Associate[arr.length];

        System.out.println("Enter Input ");

        for (int i = 0; i < arr.length; i++) {

            id = sc.nextInt();
            name = sc.next();
            technology = sc.next();
            experienceInYears = sc.nextInt();
            arr[i] = new Associate(id, name, technology, experienceInYears);

        }

        for (Associate i : arr) {
            System.out.print(i.getId() + " " + i.getName() + " " + i.getTech() + " " + i.getExperience());
            System.out.println("");
        }

        for (int i = 0; i < arr.length; i++) {
            newArr = associatesForGivenTechnology(arr, "Java");
        }

        System.out.println("Refined Array ");

        for (Associate i : newArr) {
            if (i != null) {
                System.out.println(i.getId());
            }
        }

    }

}

class Associate {

    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;

    }

    public String getTech() {
        return this.technology;
    }

    public int getExperience() {
        return this.experienceInYears;
    }

    public String getName() {
        return this.name;

    }

    public int getId() {
        return this.id;
    }
}