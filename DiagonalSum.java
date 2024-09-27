public class DiagonalSum {
    public static void main(String[] args) {
        // Sample matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = 0;
        
        // Calculate the sum of diagonal elements
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        
        // Print the result
        System.out.println("Sum of diagonal elements: " + sum);
    }
}