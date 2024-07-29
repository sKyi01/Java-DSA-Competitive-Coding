

public class StarHashEqualCount {

    public static void main(String[] args){

        int starCount=0;
        int hashCount=0;


        String str="***###";

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='*'){
                starCount++;
            }

            if(str.charAt(i)=='#'){
                hashCount++;

            }


        }
        System.out.println(starCount);
        System.out.println(hashCount);

        if((starCount-hashCount)==0){
            System.out.println(0);
        }
        else{
            System.out.println("not equal");
        }

    }
    
}
