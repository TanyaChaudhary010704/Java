//https://leetcode.com/problems/concatenation-of-array/
public class Solution2 {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 1, 1, 2, 1 };
    int[] ans = getConcatenation(nums);
    for (int a: ans) {
      System.out.print(a+" ");
    }
  }

  public static int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int ans[] = new int[n*2];
    int idx=0;
    for(int num:nums){
        ans[idx]=num;
        ans[idx+n]=num;
        idx++;
    }
    return ans;
  }
}
