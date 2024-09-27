public class CoordinateDistance {
    public static String retriveInt(String s) {
        //StringBuilder temp = new StringBuilder();
        String temp="";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || s.charAt(i) == ',') {
                temp+=s.charAt(i);
            }
        }

        System.out.println(temp.toString());
        return temp.toString();
    }

    public static double calculateDistance(String s1, String s2) {
        String[] coords1 = s1.split(",");
        String[] coords2 = s2.split(",");

        int x1 = Integer.parseInt(coords1[0]);
        int y1 = Integer.parseInt(coords1[1]);
        int x2 = Integer.parseInt(coords2[0]);
        int y2 = Integer.parseInt(coords2[1]);

        int dx = x2 - x1;
        int dy = y2 - y1;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        String s1 = "A:(43,96)";
        String s2 = "B:(13,76)";
        String c1 = retriveInt(s1);
        String c2 = retriveInt(s2);

        double result = calculateDistance(c1, c2);

        System.out.println("Distance between coordinates: " + result);
    }
}

