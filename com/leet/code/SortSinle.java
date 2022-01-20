package leet.code;

import java.util.Arrays;

public class SortSinle {
    //kuai
    public static void kuaiq(int[] nums, int left, int right) {
        if (left > right) return;
        int i = left;
        int j = right;
        int base = nums[i];
        while (i != j) {
            while (nums[j] >= base && i < j) {
                j--;
            }
            while (nums[i] <= base && i < j) {
                i++;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        nums[left] = nums[i];
        nums[i] = base;
        kuaiq(nums, left, i - 1);
        kuaiq(nums, i + 1, right);
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
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }

    //maopao
    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 432, 464, 321, 32, 645, 678, 543, 234, 754, 24143, 4127347, 312123, 5476};
//        kuaiq(nums, 0, nums.length - 1);
//        select(nums);
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
}
