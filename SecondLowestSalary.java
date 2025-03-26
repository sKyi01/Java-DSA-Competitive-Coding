import java.util.*;

public class SecondLowestSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input size");
        int inputs = sc.nextInt();
        Salaries[] arr = new Salaries[inputs];
        System.out.println("Enter data");

        for (int i = 0; i < inputs; i++) {
            int employeeId = sc.nextInt();
            String employeeName = sc.next();
            int age = sc.nextInt();
            String gender = sc.next();

            int salary = sc.nextInt();

            arr[i] = new Salaries(employeeId, employeeName, age, gender, salary);

        }

        System.out.println(

                "Your Inserted Data");
        System.out.println("");

        for (Salaries i : arr) {
            System.out.println(i.getEmployeeId() + " " + i.getEmployeeName() + " " + i.getGender() + " " + i.getAge()
                    + " " + i.getSalary());
        }

        System.out.println("Output");

        Salaries filter = getEmployeeWithSecondLowestSalary(arr);
        int count = countEmployeesBasedOnAge(arr, 30);

        System.out.println(filter.getEmployeeId() + "#" + filter.getEmployeeName());
        System.out.println(count);

    }

    public static Salaries getEmployeeWithSecondLowestSalary(Salaries[] s) {
    
        Salaries secondLowestSalary = null;

        if (s.length < 2) {
            return null;
        }

        Arrays.sort(s, Comparator.comparing(Salaries::getSalary));
        int lowestSalary = s[0].getSalary();

        for (Salaries a : s) {
            if (a.getSalary() > lowestSalary) {
                secondLowestSalary = a;
                break;
            }
        }

        System.out.print("Second Lowest Age : ");

        System.out.println(secondLowestSalary.getSalary());

        return secondLowestSalary;

    }

    public static int countEmployeesBasedOnAge(Salaries[] arr, int age) {
        int count = 0;

        for (Salaries i : arr) {
            if (i.getAge() == age) {
                count++;
            }
        }

        if (count == 0) {
            return 0;

        }

        return count;

    }

}

class Salaries {

    private int employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private int salary;

    public Salaries() {

    }

    public Salaries(int employeeId, String employeeName, int age, String gender, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.age = age;
        this.salary = salary;

    }

    public int getEmployeeId() {
        return this.employeeId;

    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getAge() {
        return this.age;

    }

    public int getSalary() {
        return salary;
    }

    public String getGender() {
        return this.gender;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;

    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}