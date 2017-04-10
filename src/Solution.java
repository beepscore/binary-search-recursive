import java.util.Arrays;

/**
 * Created by stevebaker on 4/10/17.
 */

// https:// www.youtube.com/watch?v=P3YID7liBug&index=26&list=PLX6IKgS15Ue02WDPRCmYKuZicQHit9kFt

public class Solution {

    public static void main(String[] args) {

        int[] sorted_array = new int[] {2, 4, 5, 8, 14, 19, 20, 25, 27, 31, 44, 53, 59, 88, 98};

        System.out.println(Arrays.toString(sorted_array));
        Boolean result = Solution.contains(sorted_array, 3);
        System.out.println(result);
    }

    public static Boolean contains(int[] sorted_array, int number) {
        return Boolean.TRUE;
    }

}
