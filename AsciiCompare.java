import java.util.*;


public class AsciiCompare{

    public static void main(String[] args) {
        String str="sky";
        int[] arr={7,6,4,7,8,3};
        Integer[] newArr=new Integer[arr.length];
        int index=0;
        for(int i: arr){

            newArr[index]=i;
            index++;


        }
        char[] ch=str.toCharArray();
        Arrays.sort(newArr,Collections.reverseOrder());
        System.out.println(newArr[0]);


    }




}