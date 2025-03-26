
import java.util.*;

public class RemoveDuplicateTest {
    public static void main(String[] args) {
        char[] arr={'a','b','n','a','b','t','j','t'};
        String str="akash-Khandagale";
       
       
        
        char[] ch= new char[arr.length];

        Set<Character> s= new LinkedHashSet<>();

        for(char i: arr){
            s.add(i);
        }

        for(char i: s){
            System.out.println(i);
        }


       


    }
}                               
