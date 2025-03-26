public class FindDp {
   public static void main(String[] args) {

    String str="aeiou";
    String t="hey iam akash";
    char[] ch= str.toCharArray();
    int count=0;

    for(int i=0;i<t.length();i++){

        if(str.contains(t.charAt(i))){
            count++;


        }

    }

    System.out.println(count);

    
    
   } 
}
