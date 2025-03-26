import java.util.*;

public class NavelVesselTest {

    public static int findAvgVoyagesByPct(Navel[] arr, int percentage) {

        int p = 0;
        int count = 0;
        int completedVoyages = 0;

        for (Navel v : arr) {

            p = (v.getNoOfVoyagesCompleted() * 100) / v.getNoOfVoyagesPlanned();

            if (p >= percentage) {

                completedVoyages = completedVoyages + v.getNoOfVoyagesCompleted();
                count++;

            }

        }

        return count != 0 ? completedVoyages / count : 0;

    }

    public static Navel findVesselByGrade(Navel[] arr, String purpose) {
        boolean found = false;

        for (Navel v : arr) {

            int p = 0;

            if (v.getPurpose().equalsIgnoreCase(purpose)) {
                found = true;

                p = (v.getNoOfVoyagesCompleted() * 100) / v.getNoOfVoyagesPlanned();

                if (p == 100) {

                    v.setClassification("Star");
                    return v;

                } else if (p >= 80 && p <= 99) {

                    v.setClassification("Leader");
                    return v;

                } else if (p >= 55 && p <= 79) {
                    v.setClassification("Inspirer");
                    return v;

                } else {
                    v.setClassification("Striver");
                    return v;

                }

            }

        }
        return null;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Navel[] arr = new Navel[4];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Enter data no : " + i);

            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int planned = sc.nextInt();
            sc.nextLine();
            int completed = sc.nextInt();
            sc.nextLine();
            String purpose = sc.nextLine();

            arr[i] = new Navel(id, name, planned, completed, purpose);

        }

        int percentage = sc.nextInt();
        sc.nextLine();
        String purpose = sc.nextLine();

        int output1 = findAvgVoyagesByPct(arr, percentage);

        if (output1 > 0) {
            System.out.println(output1);

        } else {
            System.out.println("Not Available");
        }

        Navel output2 = findVesselByGrade(arr, purpose);

        if (output2 != null) {
            System.out.println(output2.getName() + "%" + output2.getClassfication());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }

    }

}

class Navel {

    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purporse;
    private String classification;

    public String getName() {
        return vesselName;
    }

    public void setClassification(String c) {
        this.classification = c;

    }

    public String getClassfication() {
        return classification;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purporse;
    }

    public Navel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purporse = purpose;

    }

}