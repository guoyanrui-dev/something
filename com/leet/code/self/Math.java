package leet.code.self;

import java.util.Arrays;

/**
 * @author guoyanrui on 2022/1/12
 */
public class Math {
    public static void main(String[] args) {
        double value = 73828.98329;
        System.out.println(String.format("%.2f", value));
        int[] nums={1,43,21,5,65,87,35443,7578568,243};
        select(nums);
        System.out.println(Arrays.toString(nums));
    }

    //xuanze
    public static void select(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }
}
