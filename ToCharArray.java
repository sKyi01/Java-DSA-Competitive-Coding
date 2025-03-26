public class ToCharArray {

    public static void main(String[] args) {
        String str="Akash";
        char[] ch= new char[str.length()];

        ch= str.toCharArray();
     

        for(char c: ch){
            System.out.println(c);
        }
    }
    
}
