import java.util.*;

 class TestRemoveDuplicate{
    public static void main(String[] args) {

        char[] arr={'a','b','r','r','a','y','b','y'};

        Set<Character> result= new LinkedHashSet<>();

        for(char ch: arr){

            result.add(ch);

        }

        for(char ch: result){
            System.out.print(ch+" - ");

        }
        


    }


}