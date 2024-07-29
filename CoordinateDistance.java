public class CoordinateDistance {
    public static String retriveInt(String s) {

        String temp = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == ',') {
                temp += s.charAt(i);

            }

        }

        System.out.println(temp);
        return temp;

    }

    public static double calculateDistance(String s1, String s2) {

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        String x1 = "";
        String x2 = "";
        String y1 = "";
        String y2 = "";
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < c1.length; i++) {

            if (c1[i] == ',') {
                break;
            }
            x1 += c1[i];
            count++;
            System.out.println(c1[i]);

        }

        for (int i = count; i < c1.length; i++) {
            if (c1[i] >= '0' && c1[i] <= '9') {
                x2 += c1[i];

            }
        }

        for (int i = 0; i < c2.length; i++) {

            if (c2[i] == ',') {
                break;
            }
            y1 += c2[i];
            count2++;
            System.out.println(c2[i]);

        }

        for (int i = count; i < c2.length; i++) {
            if (c2[i] >= '0' && c2[i] <= '9') {
                y2 += c2[i];

            }
        }

        System.out.println(" ");

        for (int i = 0; i < c2.length; i++) {
            System.out.println(c2[i]);
        }

        System.out.println("X 1: " + x1);
        System.out.println("X 2: " + x2);
        System.out.println("Y 1: " + y1);
        System.out.println("Y 2: " + y2);

        int xc1 = Integer.parseInt(x1);
        int xc2 = Integer.parseInt(x2);
        int yc1 = Integer.parseInt(y1);
        int yc2 = Integer.parseInt(y2);
        int temp = xc2;
        xc2 = yc1;
        yc1 = temp;

        int xc = xc2 - xc1;
        int yc = yc2 - yc1;

        double result = Math.sqrt((xc * xc) + (yc * yc));

        return result;

    }

    public static void main(String[] args) {

        String s1 = "A: (43, 96)";
        String s2 = "B: (13,76)";
        String c1 = retriveInt(s1);
        String c2 = retriveInt(s2);

        // System.out.println(c1 + " "+c2);

        double result = calculateDistance(c1, c2);

        System.out.println("distance between coordinates : " + result);

    }

}


/*public class CoordinateDistance {
    public static String retriveInt(String s) {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || s.charAt(i) == ',') {
                temp.append(s.charAt(i));
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
 */
