package leet.code;


import java.util.Arrays;

/**
 * @author guoyanrui on 2022/2/17
 */
public class StartTest {
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
        int[] arrays={1,54,7657,322,8,9,5445,0,76,43667,8678};
        bubble(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
