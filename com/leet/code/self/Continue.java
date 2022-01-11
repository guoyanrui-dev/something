package leet.code.self;

import java.util.Arrays;

/**
 * @author guoyanrui on 2022/1/11
 */
public class Continue {
    //maopao
    public static void mao(int[] nusm) {
        for (int i = 0; i < nusm.length - 1; i++) {
            for (int j = 0; j < nusm.length - 1 - i; j++) {
                if (nusm[j + 1] < nusm[j]) {
                    int temp = nusm[j];
                    nusm[j] = nusm[j + 1];
                    nusm[j + 1] = temp;
                }
            }
        }
    }

    //xuanze
    public static void selct(int[] nums) {
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

    //kuaipai
    public static void quikly(int[] nums, int left, int right) {
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
        quikly(nums, left, i - 1);
        quikly(nums, i + 1, right);
    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 43, 56786, 65, 324, 21, 876, 98, 68, 34, 66, 8667};
//        mao(nums);
//        selct(nums);
        quikly(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
