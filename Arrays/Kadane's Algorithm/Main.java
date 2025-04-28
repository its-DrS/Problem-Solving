class Solution {
    public int maxSubarraySum(int[] arr) {
        int n = arr.length;

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int result = solution.maxSubarraySum(arr);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}
