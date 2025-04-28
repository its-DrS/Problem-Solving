class Solution {
    int missingNum(int arr[]) {
        long sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        long total = ((long)(n + 1) * (n + 2)) / 2;
        return (int)(total - sum);
    }
    
}
public class Main {
    
    public static void main(String args[]){
        Solution solution = new Solution();
        int arr[] = {1, 2, 3, 5};
        int ans = solution.missingNum(arr);
        System.out.println("missing num = " + ans);
    }
    
}