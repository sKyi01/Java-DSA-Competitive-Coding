 import java.util.Arrays;

public class SecondSmallestSecondLargest {

    public static void main(String[] args) {
        // Step 2: Initialize an array with some numbers
        int[] numbers = {100,34, 15, 88, 2, 76, 45, 6, 99,0, 1};

        // Check if the array has at least two elements
        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        // Step 3: Sort the array
        Arrays.sort(numbers);

        // Step 4: Access and print the second smallest and second largest elements
        int secondSmallest = numbers[1];
        int secondLargest = numbers[numbers.length - 2];
        
        System.out.println("The second smallest number in the array is: " + secondSmallest);
        System.out.println("The second largest number in the array is: " + secondLargest);
    }
}
 
