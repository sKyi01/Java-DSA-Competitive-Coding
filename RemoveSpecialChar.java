public class RemoveSpecialChar {

    public static void main(String[] args) {
        String str = "$%jjfdj*@#$54334";

        char[] p = str.toCharArray();
        char[] temp = new char[p.length];
        int index = 0;
        
        for (int i = 0; i < p.length; i++) {
            char ch = p[i];
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                temp[index] = ch;
                index++;
            }
        }

        // Create a new string from the valid characters in the temp array
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        System.out.println(new String(result));
    }
}
