package easy;

import java.util.Arrays;
import java.util.HashMap;


public class Two_sum {


    public static void main(String[] args) {
        int[] nums = {2,7,5,9,11};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {


        int[] result = new int[2];

        if (nums == null || nums.length < 2) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {

                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
