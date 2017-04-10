import java.util.Arrays;

/**
 * Created by stevebaker on 4/10/17.
 */

// https:// www.youtube.com/watch?v=P3YID7liBug&index=26&list=PLX6IKgS15Ue02WDPRCmYKuZicQHit9kFt

public class Solution {

    public static void main(String[] args) {

        int[] sorted_array = new int[] {2, 4, 5, 8, 14, 19, 20, 25, 27, 31, 44, 53, 59, 88, 98};

        System.out.println(Arrays.toString(sorted_array));
        // test extremes
        Boolean result = Solution.contains(sorted_array, 2, 0, sorted_array.length - 1);
        System.out.println(result);
        result = Solution.contains(sorted_array, 98, 0, sorted_array.length - 1);
        System.out.println(result);

        result = Solution.contains(sorted_array, 2001, 0, sorted_array.length - 1);
        System.out.println(result);

        result = Solution.contains(sorted_array, 3, 0, sorted_array.length - 1);
        System.out.println(result);

        result = Solution.contains(sorted_array, 5, 0, sorted_array.length - 1);
        System.out.println(result);

        result = Solution.contains(sorted_array, 53, 0, sorted_array.length - 1);
        System.out.println(result);
    }

    public static Boolean contains(int[] sorted_array, int number, int index_min, int index_max) {

        int index_mid = index_min + ((index_max - index_min)/2);
        System.out.println(String.format("number %d, index_min %d,  index_max %d, index_mid %d", number, index_min, index_max, index_mid));

        while (index_min <= index_max) {

            if (sorted_array[index_mid] == number) {
                return Boolean.TRUE;
            }

            if (sorted_array[index_mid] < number) {
                // already checked index_mid
                index_min = index_mid + 1;
                return Solution.contains(sorted_array, number, index_min, index_max);
            }

            if (sorted_array[index_mid] > number) {
                // already checked index_mid
                index_max = index_mid - 1;
                return Solution.contains(sorted_array, number, index_min, index_max);
            }
        }

        return Boolean.FALSE;
    }

}
