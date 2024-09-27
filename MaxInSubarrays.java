public class MaxInSubarrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1, 6, 3};
        int k = 3;
        
        int[] result = findMaxInSubarrays(arr, k);
        
        // Print the result
        for (int max : result) {
            System.out.print(max + " ");
        }
    }
    
    public static int[] findMaxInSubarrays(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            result[i] = max;
        }
        
        return result;
    }
}