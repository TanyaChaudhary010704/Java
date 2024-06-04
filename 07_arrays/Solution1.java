//https://leetcode.com/problems/build-array-from-permutation/
public class Solution1 {
  public static void main(String[] args) {
    int nums[] = { 0, 2, 1, 5, 3, 4 };
    int[] ans = buildArray(nums);
    for (int num : ans) {
      System.out.print(num);
    }
  }

  static public int[] buildArray(int[] nums) {
    int ans[] = new int[nums.length];
    int i = 0;
    for (int num : nums) {
      ans[i++] = nums[num];
    }
    return ans;
  }
}
