import java.util.Arrays;

public class Sort {

    public static char[] checkAnagram(String str) {

        

        char[] s = str.toCharArray();
        Character temp;

        for (int i = 0; i < s.length; i++) {

            for (int j = 0; j < s.length; j++) {

                if (s[i] < s[j]) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;

                }

            }

        }

        return s;




    }

    public static void main(String[] args) {

       // int[] arr = { 7, 4, 6, 9, 3, 2, 9, 6 };
        String str = "sdfg";
        String str2="gfds";

        char[] s1= checkAnagram(str);
        char[] s2= checkAnagram(str2);

     

        for (int i=0;i<s1.length;i++){
            System.out.print(s1[i]+"");
        }
        System.out.println("");
        for (int i=0;i<s2.length;i++){
            System.out.print(s2[i]+"");
        }
        System.out.println("");


        
         
        System.out.println(Arrays.equals(s1,s2));



      
    }
}
