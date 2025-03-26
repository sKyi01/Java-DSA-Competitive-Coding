import java.util.*;

public class LaptopIpaSolution {
    public static void main(String[] args) {

        System.out.println("Size of ARGS : " + args.length);

        Scanner sc = new Scanner(System.in);
        Laptop[] mainArr = new Laptop[4];

        for (int i = 0; i < mainArr.length; i++) {

            int id = sc.nextInt();

            sc.nextLine();

            String br = sc.nextLine();

            String os = sc.nextLine();

            double pr = sc.nextDouble();

            sc.nextLine();

            int rat = sc.nextInt();

            sc.nextLine();

            mainArr[i] = new Laptop(id, br, os, pr, rat);
        }
        String par1 = sc.nextLine();

        String par2 = sc.nextLine();

        int ans1 = countOfLaptopsByBrand(mainArr, par1);

        if (ans1 > 0) {

            System.out.println(ans1);

        }

        else {

            System.out.println("The given brand is not available");

        }

        Laptop[] ans2 = searchLaptopByOsType(mainArr, par2);

        if (ans2 != null) {

            for (Laptop v : ans2) {

                System.out.println(v.getLaptopId());

                System.out.println(v.getRating());

            }

        } else {

            System.out.println("The given os is not available");

        }
    }

    public static int countOfLaptopsByBrand(Laptop[] arr, String b) {

        int count = 0;

        boolean found = false;

        for (Laptop v : arr) {

            if (v.getBrand().equalsIgnoreCase(b) && v.getRating() > 3) {

                count++;

                found = true;

            }

        }

        return found ? count : 0;

    }

    public static Laptop[] searchLaptopByOsType(Laptop[] arr, String os) {

        ArrayList<Laptop> resultArr = new ArrayList<>();

        for (Laptop v : arr)

            if (v.getosType().equalsIgnoreCase(os)) {

                resultArr.add(v);

            }

        Laptop[] result = resultArr.toArray(new Laptop[resultArr.size()]);

        Arrays.sort(result, Comparator.comparingInt(Laptop::getLaptopId).reversed());

        return result;
    }

}

class Laptop {

    private int laptopId;

    private String brand;

    private String osType;

    private double price;

    private int rating;

    public int getLaptopId() {
        return laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public String getosType() {

        return osType;
    }

    public double getPrice() {

        return price;
    }

    public int getRating() {

        return rating;

    }

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {

        this.laptopId = laptopId;

        this.brand = brand;

        this.osType = osType;

        this.price = price;

        this.rating = rating;

    }

}
