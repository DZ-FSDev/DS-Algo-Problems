import java.util.Arrays;

public class FindMiddle {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 7, 1, 2, 3, 4, 9 };
        int[] arr3 = { 1, 2 };

        System.out.println(Arrays.toString(arr1) + " --> " + Arrays.toString(makeMiddle(arr1)));
        System.out.println(Arrays.toString(arr2) + " --> " + Arrays.toString(makeMiddle(arr2)));
        System.out.println(Arrays.toString(arr3) + " --> " + Arrays.toString(makeMiddle(arr3)));
    }

    public static int[] makeMiddle(int[] nums) {
        int[] middleArr = new int[2];

        int midNum1 = (nums.length / 2) - 1;
        int midNum2 = nums.length / 2;

        middleArr[0] = nums[midNum1];
        middleArr[1] = nums[midNum2];

        return middleArr;
    }
}