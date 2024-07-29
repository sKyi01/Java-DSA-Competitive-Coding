public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="akash sanjay khandagale";
        String temp="";

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)!=32){
                temp+=str.charAt(i);

            }
        }
        System.out.println(temp);
    }
    
}
