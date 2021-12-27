package leet.code;

import java.util.Arrays;

/**
 * @author guoyanrui on 2021/12/24
 */
public class Some {
    //快排
    public static void paixu(int[] nums,int left,int right){
        if(left>right)return;
        int i=left;
        int j=right;
        int base = nums[i];
        while(i!=j){
            while(nums[j]>=base&&i<j){
                j--;
            }
            while(nums[i]<=base&&i<j){
                i++;
            }
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        nums[left]=nums[i];
        nums[i]=base;
        paixu(nums,left,i-1);
        paixu(nums,i+1,right);
    }

    public static void main(String[] args) {
        int[] nums={21,43,3,657,67,8,32,8,9,9765,654,43436};
        paixu(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
