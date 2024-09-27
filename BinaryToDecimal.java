public class BinaryToDecimal {
    public static void main(String[] args) {
        int[] binary = {1, 1, 1, 1}; // This represents 123 in binary
        int decimal = 0;
        int power = 0;

        for (int i = binary.length - 1; i >= 0; i--) {
            if (binary[i] == 1) {
                decimal += powerOfTwo(power);
            }
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);
    }

    // Custom method to calculate power of 2
    public static int powerOfTwo(int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= 2;
        }
        return result;
    }
}