import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        System.out.println(nums.length);
        for (int i = 0; i< nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Solution program = new Solution();
        int[] result = program.twoSum(nums,target);
    }
    public int [] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}