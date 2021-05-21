package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};

        reverseArray(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    // Reversing an array in-place overview
    public static int[] reverseArray(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (endIndex > startIndex) {
            swap(nums, startIndex, endIndex);

            startIndex++;
            endIndex--;
        }

        return nums;
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
