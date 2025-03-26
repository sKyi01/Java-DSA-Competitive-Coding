import java.util.*;

public class ConsecutiveVovelsCount {

    public static void main(String[] args) {
        
        String str="I enjoy eating spaghetti and meatballs for dinner";
        String[] arr= str.split(" ");
        int count=0;
        


        for(String i: arr){
            if(checkConsecutiveVowels(i)){
                count++;
            }


        }

        System.out.println(count);


        
    }


    public static boolean checkConsecutiveVowels(String str){
        String vowels="aeiou";
        

        for(int i=0;i<str.length()-1;i++){

        
           
            if(vowels.contains(Character.toString(str.charAt(i))) && vowels.contains(Character.toString(str.charAt(i+1)))){
                return true;

            }

        }

        return false;

    }
    
}
