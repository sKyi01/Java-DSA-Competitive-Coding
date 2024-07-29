import java.util.*;

public class ReplaceWithRank {

    public static int findRank(int n, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i + 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = { 20, 15, 26, 2, 98, 6 };

        int[] sortedArray = arr.clone();
        int[] rank = new int[arr.length];
        int temp;
        int count = 0;

        Arrays.sort(sortedArray);

        for (int i = 0; i < arr.length; i++) {

            rank[i] = findRank(arr[i], sortedArray);

        }

        for (int i = 0; i < rank.length; i++) {
            System.out.print(rank[i] + " ");
        }

    }

}
