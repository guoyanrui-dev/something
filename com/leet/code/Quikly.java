package leet.code;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author guoyanrui on 2021/12/28
 */
public class Quikly {
    //冒泡
    public static void bobble(int[] nums) {
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

    //kuaipai
    public static void quiklySort(int[] nums, int left, int right) {
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
        quiklySort(nums, left, i - 1);
        quiklySort(nums, i + 1, right);
    }

    //输出九九乘法表
    @Test
    public static void jiu() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 543, 32, 32, 12, 2, 3, 4, 5, 678998, 788};
//        bobble(nums);
        quiklySort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
