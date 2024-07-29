public class OccuranceOfEachChar {

    public static void main(String[] args) {

        String str="akash Khandagale";
        
        int count=0;

        for(int i=0;i<str.length();i++){
            count=0;
            for(int j=0;j<str.length()-1;j++){
                if(str.charAt(i)==str.charAt(j+1)){
                    count++;
                }
                
            }
            System.out.println(str.charAt(i) +" "+ count);
        }
        
    }
    
}
