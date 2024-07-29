public class PalidromeString {

    public static boolean checkPalidromeString(String str) {

        String original= str;

        String temp = "";

        for (int i = str.length()-1; i >= 0; i--) {

            temp = temp + str.charAt(i);

        }

        System.out.println(temp);
        System.out.println(str);


        return temp.equals(str);

    }

    public static void main(String[] args) {
        int a=456542;

        String t= String.valueOf(a);

        String str = "1234321";

        if(checkPalidromeString(t)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
