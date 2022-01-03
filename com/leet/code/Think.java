package leet.code;

import java.util.Arrays;

public class Think {
    //不知道这些东西到底有什么用，他妈的
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

    //哎，这些东西一会记得住，一会记不住，还能不能坚持呢
    public static void kuai(int[] nums, int left, int right) {
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
        kuai(nums, left, i - 1);
        kuai(nums, i + 1, right);
    }

    //mao
    public static void bubu(int[] nums) {
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
        int[] nums = {6453, 4214, 64675, 12, 35, 868, 45, 7986, 3, 679, 8, 5437, 8};
//        select(nums);
//        kuai(nums, 0, nums.length - 1);
        bubu(nums);
        System.out.println(Arrays.toString(nums));
    }
}
