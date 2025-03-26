import java.util.*;

import javax.xml.crypto.dsig.TransformException;

public class TravelAgenciesSolution {



    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr){

        Arrays.sort(arr, Comparator.comparing(TravelAgencies :: getPrice).reversed());

        return arr[0].getPrice();

    }

    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] arr, int regNo, String packageType){

        for(TravelAgencies v : arr){

            if(v.getRegNo()==regNo && v.getPackageType().equalsIgnoreCase(packageType)){

                return v;

            }

        }

        return null;


    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        TravelAgencies[] arr= new TravelAgencies[4];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter data : " + i);
            int regNo= sc.nextInt();
            sc.nextLine();
            String agencyName= sc.nextLine();
            String packageType= sc.nextLine();
            int price=sc.nextInt();
            sc.nextLine();
            boolean isFlightThere= sc.nextBoolean();
            arr[i]= new TravelAgencies(regNo, agencyName, packageType, price, isFlightThere);

        }

        int param1= sc.nextInt();
        sc.nextLine();
        String param2= sc.nextLine();
        sc.close();

        int output1= findAgencyWithHighestPackagePrice(arr);
        System.out.println(output1);

        TravelAgencies output2= agencyDetailsForGivenldAndType(arr, param1, param2);

        if(output2!=null){
            System.out.println(output2.getAgencyName()+":"+output2.getPrice());

        }else{
            System.out.println(
                "No Such Data"
            );
        }


    }
    
}

class TravelAgencies{

    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public int getPrice(){
        return price;
    }

    public int getRegNo(){
        return regNo;
    }

    public String getPackageType(){
        return packageType;
    }

    public String getAgencyName(){
        return agencyName;
    }

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;

    }




 
}
