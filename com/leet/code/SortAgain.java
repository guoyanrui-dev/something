package leet.code;

import java.io.IOException;
import java.util.Arrays;

import static leet.code.ReadOrWrite.readData;

public class SortAgain {
    //选择排序
    public static void selectSort(int[] nums) {
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

    //快速排序
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

    //冒泡排序
    public static void bubbleSort(int[] nums) {
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

    public static void main(String[] args) throws IOException {
        int[] nums = {1, 3232, 54, 2, 3, 4, 5, 7, 8, 4334, 324, 6346, 75, 65, 86, 867856, 532423, 7686, 980080, 535234, 423423, 9089054, 8945327, 909009, 32423, 654363, 423, 8653, 5235};
        quiklySort(nums, 0, nums.length - 1);
//        selectSort(nums);
//        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
