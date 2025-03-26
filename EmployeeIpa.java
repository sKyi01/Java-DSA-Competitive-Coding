import java.util.*;

public class EmployeeIpa {

    public static int findCountOfEmployeesUsingCompTransport(Employee[] arr, String param1) {
        int count = 0;
        boolean found = false;

        for (Employee v : arr) {

            if (v.getBranch().equalsIgnoreCase(param1)) {

                count++;
                found = true;

            }

        }

        return found ? count : 0;

    }

    public static Employee findEmployeeWithSecondHighestRating(Employee[] arr) {

        ArrayList<Employee> newArr = new ArrayList<>();
        boolean found = false;

        for (Employee v : arr) {

            if (v.getTransport() == false) {

                newArr.add(v);
                found = true;

            }

        }

        Employee[] result = newArr.toArray(new Employee[newArr.size()]);

        Arrays.sort(result, Comparator.comparing(Employee::getRating).reversed());

        return found ? result[1] : null;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] arr = new Employee[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter data no : "+ i);

            int empId = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();
            sc.nextLine();
            boolean transport = sc.nextBoolean();
            sc.nextLine();

            arr[i] = new Employee(empId, name, branch, rating, transport);

        }

        String param1 = sc.nextLine();

        int output1 = findCountOfEmployeesUsingCompTransport(arr, param1);

        if (output1 > 0) {
            System.out.println(output1);

        } else {
            System.out.println("No such Employees");

        }

        Employee output2 = findEmployeeWithSecondHighestRating(arr);

        if (output2 != null) {

            System.out.println(output2.getId());
            System.out.println(output2.getName());

        } else {
            System.out.println("All Employees using company transport");

        }

    }

}

class Employee {

    private int employeeld;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public int getId() {
        return employeeld;
    }

    public String getBranch() {
        return branch;
    }

    public String getName() {
        return name;
    }

    public boolean getTransport() {

        return transport;

    }

    public double getRating() {
        return rating;
    }

    public Employee(int employeeld, String name, String branch, double rating, boolean transport) {

        this.employeeld = employeeld;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;

    }

}
