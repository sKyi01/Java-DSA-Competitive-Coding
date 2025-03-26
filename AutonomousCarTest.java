import java.util.*;

public class AutonomousCarTest {

    public static int findTestPassedByEnv(AutonomousCar[] arr, String param1) {

        int count = 0;
        boolean found = false;

        for (AutonomousCar v : arr) {
            if (v.getEnvironment().equalsIgnoreCase(param1)) {

                found = true;

                count = count + v.getNoOfTestsPassed();

            }

        }
        return found ? count : 0;

    }

    public static AutonomousCar[] updateCarGrade(AutonomousCar[] arr, String param2) {

        ArrayList<AutonomousCar> newArr = new ArrayList<>();
        boolean found = false;

        for (AutonomousCar v : arr) {

            if (v.getBrand().equalsIgnoreCase(param2)) {
                found = true;

                if ((v.getNoOfTestsPassed() * 100) / v.getNoOfTestsConducted() >= 80) {
                    v.setGrade("A1");

                } else {
                    v.setGrade("B2");
                }

                newArr.add(v);

            }

        }

        AutonomousCar[] result = newArr.toArray(new AutonomousCar[newArr.size()]);

        return found ? result : null;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AutonomousCar[] arr = new AutonomousCar[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Data No : "+ i);

            int carId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            int nTC = sc.nextInt();
            sc.nextLine();
            int nTP = sc.nextInt();
            sc.nextLine();
            String env = sc.nextLine();
            arr[i] = new AutonomousCar(carId, brand, nTC, nTP, env);

        }

        String param1 = sc.nextLine();
        String param2 = sc.nextLine();

        int output1 = findTestPassedByEnv(arr, param1);

        if (output1 > 0) {
            System.out.println(output1);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar[] output2 = updateCarGrade(arr, param2);

        if (output2 != null) {
            for (AutonomousCar v : output2) {
                System.out.println(v.getBrand() + "::" + v.getGrade());

            }

        } else {
            System.out.println("No Car is available with the specified brand");
        }

    }

}

class AutonomousCar {

    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    public int getNoOfTestsPassed() {
        return noOfTestsPassed;
    }

    public int getNoOfTestsConducted() {
        return noOfTestsConducted;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getBrand() {
        return brand;

    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
        this.grade = grade;

    }

}
