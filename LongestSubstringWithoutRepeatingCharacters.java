import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters obj =
                new LongestSubstringWithoutRepeatingCharacters();

        String s = "abcabcbb";

        int result = obj.lengthOfLongestSubstring(s);

        System.out.println("Input: " + s);
        System.out.println("Longest Length: " + result);
    }
}
