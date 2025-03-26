import java.lang.reflect.Array;
import java.util.*;

public class PlayerIPA {

    public static int findPlayerWithLowestRuns(Player[] arr, String playerType){

        ArrayList<Player> newArr= new ArrayList<>();
        

        int leastRuns=Integer.MIN_VALUE;
        boolean found=false;


        for(Player v: arr){

            if(v.getPlayerType().equalsIgnoreCase(playerType)){


                found=true;

                newArr.add(v);




            }


        }

        if(found==true){
            Player[] result=newArr.toArray(new Player[newArr.size()]);
            Arrays.sort(result, Comparator.comparing(Player::getRuns));
            leastRuns=result[0].getRuns();

        }

       

        return found ? leastRuns : 0;



    }


    public static Player[] findPlayerByMatchType(Player[] arr, String matchType){

        ArrayList<Player> resultArr= new ArrayList<>();
        boolean found=false;


        for(Player v: arr){

            if(v.getMatchType().equalsIgnoreCase(matchType)){

                found=true;

                resultArr.add(v);

            }


        }

        Player[] result= resultArr.toArray(new Player[resultArr.size()]);

       Arrays.sort(result,Comparator.comparing(Player::getPlayerId).reversed());

       return found ? result : null;

       




    }

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        

        int inputSize= sc.nextInt();
        sc.nextLine();
        Player[] arr= new Player[inputSize];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter data input : " + i);

            int playerId= sc.nextInt();
            sc.nextLine();
            String playerName=sc.nextLine();
            int runs=sc.nextInt();
            sc.nextLine();
            String playerType=sc.nextLine();
            String matchType=sc.nextLine();

            arr[i]= new Player(playerId,playerName,runs, playerType,  matchType);

        }

        String param1= sc.nextLine();
        String param2= sc.nextLine();
        
        int output1= findPlayerWithLowestRuns(arr,param1);

        if(output1>1){
            System.out.println(output1);

        }
        else{
            System.out.println("No such player");
        }

        Player[] output2= output2= findPlayerByMatchType(arr, param2);

        if(output2!=null){

            for(Player v: output2){
                System.out.println(v.getPlayerId());

            }
            

        }else{
            System.out.println("No Player with given match type");
                
        }



        





    }
    
}



class Player{

    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public String getPlayerType(){
        return playerType;
    }

    public int getRuns(){
        return runs;
    }

    public String getMatchType(){
        return matchType;
    }

    public int getPlayerId(){
        return playerId;
    }


    public Player(int playerId, String playerName,int runs,String playerType,String matchType){
        this.playerId=playerId;
        this.playerName=playerName;
        this.runs=runs;
        this.playerType=playerType;
        this.matchType=matchType;




    }






}