package leet.code.self;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyanrui on 2022/1/20
 */
public class ArraySort {
    //xuanzepai
    public static void choose(int[] nums) {
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
    public static void bubb(int[] nusm) {
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

    //kuaipai
    public static void quik(int[] nums, int left, int right) {
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
        quik(nums, left, i - 1);
        quik(nums, i + 1, right);
    }

    //字符串内字符个数统计
    public static void stringCount(String string) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : string.split("|")) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        map.forEach((String ss, Integer count) -> {
            System.out.println(ss + "有" + count + "个");
        });
    }

    public static void main(String[] args) {
        int[] nums = {5, 4332, 7, 54, 9, 86, 32, 980, 4324};
        String ss = "injuhijnjnjhuhuhijnju";
        stringCount(ss);
//        choose(nums);
//        bubb(nums);
        quik(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    @Test
    public void writeSomething() throws IOException {
        FileWriter fileWriter = new FileWriter("data\\test.csv", true);
        fileWriter.write("\r2022年1月20号写入这行文字");
        fileWriter.close();
    }

    @Test
    public void read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data\\test.csv"));
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
    }
}
