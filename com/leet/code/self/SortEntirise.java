package leet.code.self;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class SortEntirise {
    public static void quiklysort(int[] nums, int left, int right) {
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
        quiklysort(nums, left, i - 1);
        quiklysort(nums, i + 1, right);
    }

    public static void main(String[] args) throws URISyntaxException, IOException {
        int[] nums = {1, 32, 65, 3434, 76, 75, 89, 9, 4};
        quiklysort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
