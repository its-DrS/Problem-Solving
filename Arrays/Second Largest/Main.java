class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int first, second = -1;
        first = arr[0];
        for(int i = 1; i <= n / 2; i++){
            if(first < arr[i]){
                second = first;
                first = arr[i];
            }
            else if (second < arr[i] && first > arr[i]){
                second = arr[i];
            }
            if(first < arr[n - i]){
                second = first;
                first = arr[n - i];
            }
            else if (second < arr[n - i] && first > arr[n - i]){
                second = arr[n - i];
            }
        }
        return second;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {10, 10, 10};
        System.out.println("second largest = " + solution.getSecondLargest(arr));
    }
}
