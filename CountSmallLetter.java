public class CountSmallLetter{


    public static void main(String[] args) {
        
        String str="XPLORE";
        int count=0;


        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>= 'a' && str.charAt(i)<='z'){
                count++;

            }
        }

        if(count>0){
            System.out.println(count);
            
        }
        else{
            System.out.println("No lower case character present");
        }
    }
}