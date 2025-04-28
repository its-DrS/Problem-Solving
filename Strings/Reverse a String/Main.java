class Solution {
    public static String reverseString(String s) {
        int n = s.length();
        char [] chars = s.toCharArray();
        char temp;
        for(int i = 0; i < n / 2; i++){
            temp = chars[i];
            chars[i] = chars[n - 1 - i];
            chars[n - 1 - i] = temp;
        }
        return new String(chars);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Reverse word = " + Solution.reverseString("Geeks"));
    }
}