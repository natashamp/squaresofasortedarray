import java.io.*;
import java.util.*;


class Solution {
  
      public int[] sortedSquares(int[] nums) {
        int i = 0;
        while( i < nums.length ){
          nums[i] = nums[i] * nums[i];
          i++;
        }
        Arrays.sort(nums);
        return nums;
    }
  
  
  public static void main(String[] args) {
    Solution s = new Solution(); 
    int[] num = {-7,-3,2,3,11};
    System.out.println(Arrays.toString(s.sortedSquares(num)));

  }
}
