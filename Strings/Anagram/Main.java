import java.util.Arrays;

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] chars1 = s1.toLowerCase().toCharArray();
        char[] chars2 = s2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
public class Main {
    public static void main(String[] args) {
        String s1 = "geeks", s2 = "kseeg";
        String ans = Solution.areAnagrams(s1,s2) ? "Anagrams" : "Not anagrams";
        System.out.println(s1 + " " + s2 + " are " + ans);
    }
}
