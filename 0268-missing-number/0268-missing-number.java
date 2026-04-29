class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int totalSum = (n*(n+1))/2;

        int nowSum = 0;
        for(int x : nums) {
            nowSum += x;
        }

        return totalSum - nowSum;
    }
}